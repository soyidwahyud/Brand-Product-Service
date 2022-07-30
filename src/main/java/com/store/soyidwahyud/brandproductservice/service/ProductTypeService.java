package com.store.soyidwahyud.brandproductservice.service;

import com.store.soyidwahyud.brandproductservice.dto.request.ProductTypeRequest;
import com.store.soyidwahyud.brandproductservice.dto.response.ProductTypeResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductTypeService {
    List<ProductTypeResponse> findAll();
    List<ProductTypeResponse> findProductTypeByProductType(String productType);
    ProductTypeResponse createProductType(ProductTypeRequest productTypeRequest);
    ProductTypeResponse updateProductType(Long idProductType, ProductTypeRequest productTypeRequest);
    ResponseEntity<HttpStatus> deleteProductType(Long idProductType);
}
