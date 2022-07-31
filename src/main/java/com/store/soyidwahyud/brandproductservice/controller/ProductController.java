package com.store.soyidwahyud.brandproductservice.controller;

import com.store.soyidwahyud.brandproductservice.dto.response.ProductCategoryResponse;
import com.store.soyidwahyud.brandproductservice.dto.response.ProductResponse;
import com.store.soyidwahyud.brandproductservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ProductResponse> findAll(){
        return productService.findAll();
    }

}
