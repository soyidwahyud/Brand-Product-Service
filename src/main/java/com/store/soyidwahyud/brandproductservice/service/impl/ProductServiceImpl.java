package com.store.soyidwahyud.brandproductservice.service.impl;

import com.store.soyidwahyud.brandproductservice.dto.request.ProductRequest;
import com.store.soyidwahyud.brandproductservice.dto.response.ProductResponse;
import com.store.soyidwahyud.brandproductservice.mapper.ProductMapper;
import com.store.soyidwahyud.brandproductservice.repository.ProductRepository;
import com.store.soyidwahyud.brandproductservice.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<ProductResponse> findAll() {
        var productResponseList = productRepository.findAll();
        return productResponseList.stream().map(productMapper :: responseProductResponse).collect(Collectors.toList());
    }

    @Override
    public List<ProductResponse> findAllByProductType(String productType) {
        return null;
    }

    @Override
    public List<ProductResponse> findAllByProductCategory(String productCategory) {
        return null;
    }

    @Override
    public ProductResponse createProduct(ProductRequest productRequest) {
        return null;
    }

    @Override
    public ProductResponse updateProduct(Long idProduct, ProductRequest productRequest) {
        return null;
    }

    @Override
    public ResponseEntity<HttpStatus> deleteProduct(Long idProduct) {
        return null;
    }
}
