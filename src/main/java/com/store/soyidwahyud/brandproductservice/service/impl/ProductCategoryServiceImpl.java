package com.store.soyidwahyud.brandproductservice.service.impl;

import com.store.soyidwahyud.brandproductservice.dto.request.ProductCategoryRequest;
import com.store.soyidwahyud.brandproductservice.dto.response.ProductCategoryResponse;
import com.store.soyidwahyud.brandproductservice.entity.ProductCategory;
import com.store.soyidwahyud.brandproductservice.mapper.ProductCategoryMapper;
import com.store.soyidwahyud.brandproductservice.repository.ProductCategoryRepository;
import com.store.soyidwahyud.brandproductservice.service.ProductCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public List<ProductCategoryResponse> findAll() {
        var productCategoryList = productCategoryRepository.findAll();
        return productCategoryList.stream().map(productCategoryMapper :: responseProductCategoryResponse).collect(Collectors.toList());
    }

    @Override
    public List<ProductCategoryResponse> findProductCategoriesByProductCategory(String productCategory) {
        var productCategoryList = productCategoryRepository.findProductCategoriesByProductCategory(productCategory);
        return productCategoryList.stream().map(productCategoryMapper :: responseProductCategoryResponse).collect(Collectors.toList());
    }

    @Override
    public ProductCategoryResponse createProductCategory(ProductCategoryRequest productCategoryRequest) {
        var productCategory = productCategoryMapper.requestProductCategory(productCategoryRequest);
        var result = productCategoryRepository.save(productCategory);
        return productCategoryMapper.responseProductCategoryResponse(result);
    }

    @Override
    public ProductCategoryResponse updateProductCategory(Long idProductCategory, ProductCategoryRequest productCategoryRequest) {
        var productCategoryCheck = productCategoryRepository.findProductCategoryByIdProductCategory(idProductCategory).orElseThrow(() ->
            new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
        productCategoryMapper.requestUpdateProductCategory(productCategoryRequest, productCategoryCheck);
        var result = productCategoryRepository.save(productCategoryCheck);
        return productCategoryMapper.responseProductCategoryResponse(result);
    }

    @Override
    public ResponseEntity<HttpStatus> deleteProductCategory(Long idProductCategory) {
        try {
            productCategoryRepository.deleteById(idProductCategory);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
