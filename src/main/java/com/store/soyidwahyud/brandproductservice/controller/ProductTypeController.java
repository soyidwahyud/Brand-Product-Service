package com.store.soyidwahyud.brandproductservice.controller;

import com.store.soyidwahyud.brandproductservice.dto.request.ProductTypeRequest;
import com.store.soyidwahyud.brandproductservice.dto.response.ProductTypeResponse;
import com.store.soyidwahyud.brandproductservice.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    @GetMapping(value = "/product-type", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ProductTypeResponse> findAll(){
        return productTypeService.findAll();
    }

    @GetMapping(value = "/product-type/{productType}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ProductTypeResponse> findProductTypeByProductType(@PathVariable(name = "productType")String productType){
        return productTypeService.findProductTypeByProductType(productType);
    }
    @PostMapping(value = "/product-type", produces = MediaType.APPLICATION_JSON_VALUE)
    ProductTypeResponse createProductType(@RequestBody ProductTypeRequest ProductTypeRequest){
        return productTypeService.createProductType(ProductTypeRequest);
    }
    @PutMapping(value = "/product-type/{idProductType}", produces = MediaType.APPLICATION_JSON_VALUE)
    ProductTypeResponse updateProductType(@PathVariable(name = "idProductType")Long idProductType,
                                                  @RequestBody ProductTypeRequest ProductTypeRequest){
        return productTypeService.updateProductType(idProductType, ProductTypeRequest);
    }
    @DeleteMapping(value = "/product-type/{idProductType}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<HttpStatus> deleteProductType(@PathVariable Long idProductType){
        return productTypeService.deleteProductType(idProductType);
    }
}
