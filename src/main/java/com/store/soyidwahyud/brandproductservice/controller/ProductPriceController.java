package com.store.soyidwahyud.brandproductservice.controller;


import com.store.soyidwahyud.brandproductservice.dto.request.ProductPriceRequest;
import com.store.soyidwahyud.brandproductservice.dto.response.ProductPriceResponse;
import com.store.soyidwahyud.brandproductservice.service.ProductPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class ProductPriceController {

    @Autowired
    private ProductPriceService productPriceService;

    @GetMapping(value = "/product-price", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ProductPriceResponse> findAll(){
        return productPriceService.findAll();
    }
    @GetMapping(value = "/product-price/{productPriceName}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ProductPriceResponse> findByProductPriceName(@PathVariable(name = "productPriceName")String productPriceName){
        return productPriceService.findByProductPriceName(productPriceName);
    }
    @PostMapping(value = "/product-price", produces = MediaType.APPLICATION_JSON_VALUE)
    ProductPriceResponse createProductResponse(@RequestBody ProductPriceRequest productPriceRequest){
        return productPriceService.createProductPrice(productPriceRequest);
    }
    @PutMapping(value = "/product-price/{idProductPrice}", produces = MediaType.APPLICATION_JSON_VALUE)
    ProductPriceResponse updateProductPrice(@PathVariable(name = "idProductPrice")Long idProductPrice,
                                                  @RequestBody ProductPriceRequest productPriceRequest){
        return productPriceService.updateProductPrice(idProductPrice, productPriceRequest);
    }
    @DeleteMapping(value = "/product-price/{idProductPrice}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<HttpStatus> deleteProductPrice(@PathVariable Long idProductPrice){
        return productPriceService.deleteProductPrice(idProductPrice);
    }
}
