package com.store.soyidwahyud.brandproductservice.mapper;

import com.store.soyidwahyud.brandproductservice.dto.response.ProductResponse;
import com.store.soyidwahyud.brandproductservice.entity.Product;

public interface ProductMapper {
    ProductResponse responseProductResponse(Product product);

}
