package com.store.soyidwahyud.brandproductservice.dto.response;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long idProduct;
    private String productCode;
    private String productDescription;
    private ProductCategoryResponse productCategoryResponse;
    private ProductTypeResponse productTypeResponse;
}
