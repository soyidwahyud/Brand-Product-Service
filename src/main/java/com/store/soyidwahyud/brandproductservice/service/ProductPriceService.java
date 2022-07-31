package com.store.soyidwahyud.brandproductservice.service;


import com.store.soyidwahyud.brandproductservice.dto.request.ProductPriceRequest;
import com.store.soyidwahyud.brandproductservice.dto.response.ProductPriceResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductPriceService {
    List<ProductPriceResponse> findAll();
    List<ProductPriceResponse> findByProductPriceName(String productPriceName);
    ProductPriceResponse createProductPrice(ProductPriceRequest productPriceRequest);
    ProductPriceResponse updateProductPrice(Long idProductPrice, ProductPriceRequest productPriceRequest);
    ResponseEntity<HttpStatus> deleteProductPrice(Long idProducPrice);
}
