package com.store.soyidwahyud.brandproductservice.service;

import com.store.soyidwahyud.brandproductservice.dto.request.ProductCategoryRequest;
import com.store.soyidwahyud.brandproductservice.dto.response.ProductCategoryResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductCategoryService {
    List<ProductCategoryResponse> findAll();
    List<ProductCategoryResponse> findProductCategoriesByProductCategory(String productCategory);
    ProductCategoryResponse createProductCategory(ProductCategoryRequest productCategoryRequest);
    ProductCategoryResponse updateProductCategory(Long idProductCategory, ProductCategoryRequest productCategoryRequest);
    ResponseEntity<HttpStatus> deleteProductCategory(Long idProductCategory);
}
