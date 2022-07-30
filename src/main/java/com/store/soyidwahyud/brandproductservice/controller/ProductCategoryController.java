package com.store.soyidwahyud.brandproductservice.controller;

import com.store.soyidwahyud.brandproductservice.dto.request.ProductCategoryRequest;
import com.store.soyidwahyud.brandproductservice.dto.response.ProductCategoryResponse;
import com.store.soyidwahyud.brandproductservice.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class ProductCategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping(value = "/product-category", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ProductCategoryResponse> findAll(){
        return productCategoryService.findAll();
    }
    @GetMapping(value = "/product-category/{productCategory}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ProductCategoryResponse> findProductCategoriesByProductCategory(@PathVariable(name = "productCategory")String productCategory){
        return productCategoryService.findProductCategoriesByProductCategory(productCategory);
    }
    @PostMapping(value = "/product-category", produces = MediaType.APPLICATION_JSON_VALUE)
    ProductCategoryResponse createProductCategory(@RequestBody ProductCategoryRequest productCategoryRequest){
        return productCategoryService.createProductCategory(productCategoryRequest);
    }
    @PutMapping(value = "/product-category/{idProductCategory}", produces = MediaType.APPLICATION_JSON_VALUE)
    ProductCategoryResponse updateProductCategory(@PathVariable(name = "idProductCategory")Long idProductCategory,
                                                  @RequestBody ProductCategoryRequest productCategoryRequest){
        return productCategoryService.updateProductCategory(idProductCategory, productCategoryRequest);
    }
    @DeleteMapping(value = "/product-category/{idProductCategory}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<HttpStatus> deleteProductCategory(@PathVariable Long idProductCategory){
        return productCategoryService.deleteProductCategory(idProductCategory);
    }
}
