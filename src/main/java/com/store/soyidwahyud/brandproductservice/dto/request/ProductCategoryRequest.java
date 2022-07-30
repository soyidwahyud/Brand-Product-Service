package com.store.soyidwahyud.brandproductservice.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductCategoryRequest {

    private Long idProductCategory;
    private String productCategory;
    private String subProductCategory;
}
