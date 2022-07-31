package com.store.soyidwahyud.brandproductservice.service.impl;

import com.store.soyidwahyud.brandproductservice.dto.request.ProductTypeRequest;
import com.store.soyidwahyud.brandproductservice.dto.response.ProductTypeResponse;
import com.store.soyidwahyud.brandproductservice.mapper.ProductTypeMapper;
import com.store.soyidwahyud.brandproductservice.repository.ProductTypeRepository;
import com.store.soyidwahyud.brandproductservice.service.ProductTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Autowired
    private ProductTypeMapper productTypeMapper;

    @Override
    public List<ProductTypeResponse> findAll() {
        var productTypeResponseList = productTypeRepository.findAll();
        return productTypeResponseList.stream().map(productTypeMapper :: responseProductTypeResponse).collect(Collectors.toList());
    }

    @Override
    public List<ProductTypeResponse> findProductTypeByProductType(String productType) {
        var productTypeByProductTypeList = productTypeRepository.findProductTypeByProductType(productType);
        return productTypeByProductTypeList.stream().map(productTypeMapper ::responseProductTypeResponse).collect(Collectors.toList());
    }

    @Override
    public ProductTypeResponse createProductType(ProductTypeRequest productTypeRequest) {
        var productType = productTypeMapper.requestCreateProductType(productTypeRequest);
        var result = productTypeRepository.save(productType);
        return productTypeMapper.responseProductTypeResponse(result);
    }

    @Override
    public ProductTypeResponse updateProductType(Long idProductType, ProductTypeRequest productTypeRequest) {
        var productTypeCheck = productTypeRepository.findByIdProductType(idProductType);

        var productTypeUpdate = productTypeCheck.get(0);
        productTypeMapper.requestUpdateProductType(productTypeRequest, productTypeUpdate);
        var result = productTypeRepository.save(productTypeUpdate);
        return productTypeMapper.responseProductTypeResponse(result);
    }

    @Override
    public ResponseEntity<HttpStatus> deleteProductType(Long idProductType) {
        try {
            productTypeRepository.deleteById(idProductType);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
