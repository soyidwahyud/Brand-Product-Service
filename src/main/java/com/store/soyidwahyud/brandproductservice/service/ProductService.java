package com.store.soyidwahyud.brandproductservice.service;

import com.store.soyidwahyud.brandproductservice.dto.request.ProductRequest;
import com.store.soyidwahyud.brandproductservice.dto.response.ProductResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {
    List<ProductResponse> findAll();
    List<ProductResponse> findAllByProductType(String productType);
    List<ProductResponse> findAllByProductCategory(String productCategory);
    ProductResponse createProduct(ProductRequest productRequest);
    ProductResponse updateProduct(Long idProduct, ProductRequest productRequest);
    ResponseEntity<HttpStatus> deleteProduct(Long idProduct);
}
