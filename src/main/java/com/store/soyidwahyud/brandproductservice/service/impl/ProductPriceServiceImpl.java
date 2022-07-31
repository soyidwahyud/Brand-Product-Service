package com.store.soyidwahyud.brandproductservice.service.impl;

import com.store.soyidwahyud.brandproductservice.dto.request.ProductPriceRequest;
import com.store.soyidwahyud.brandproductservice.dto.response.ProductPriceResponse;
import com.store.soyidwahyud.brandproductservice.mapper.ProductPriceMapper;
import com.store.soyidwahyud.brandproductservice.repository.ProductPriceRepository;
import com.store.soyidwahyud.brandproductservice.service.ProductPriceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductPriceServiceImpl implements ProductPriceService {

    @Autowired
    private ProductPriceRepository productPriceRepository;

    @Autowired
    private ProductPriceMapper productPriceMapper;

    @Override
    public List<ProductPriceResponse> findAll() {
        var productPriceList = productPriceRepository.findAll();
        return productPriceList.stream().map(productPriceMapper :: responseProductPriceResponse).collect(Collectors.toList());
    }

    @Override
    public List<ProductPriceResponse> findByProductPriceName(String productPriceName) {
        var productPriceList = productPriceRepository.findAllByProductPrice(productPriceName);
        return productPriceList.stream().map(productPriceMapper :: responseProductPriceResponse).collect(Collectors.toList());
    }

    @Override
    public ProductPriceResponse createProductPrice(ProductPriceRequest productPriceRequest) {
        var productPrice = productPriceMapper.requestCreateProductPrice(productPriceRequest);
        var result = productPriceRepository.save(productPrice);
        return productPriceMapper.responseProductPriceResponse(result);
    }

    @Override
    public ProductPriceResponse updateProductPrice(Long idProductPrice, ProductPriceRequest productPriceRequest) {
        var productPriceCheck = productPriceRepository.findByIdProductPrice(idProductPrice);

        var productPriceUpdate = productPriceCheck.get(0);
        productPriceMapper.requestUpdateProductPrice(productPriceRequest, productPriceUpdate);
        var result = productPriceRepository.save(productPriceUpdate);
        return productPriceMapper.responseProductPriceResponse(result);
    }

    @Override
    public ResponseEntity<HttpStatus> deleteProductPrice(Long idProducPrice) {
        try {
            productPriceRepository.deleteById(idProducPrice);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
