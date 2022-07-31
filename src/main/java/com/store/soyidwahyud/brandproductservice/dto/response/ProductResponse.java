package com.store.soyidwahyud.brandproductservice.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty(value = "id_product")
    private Long idProduct;

    @JsonProperty(value = "product_code")
    private String productCode;

    @JsonProperty(value = "product_description")
    private String productDescription;

    @JsonProperty(value = "product_category")
    private ProductCategoryResponse productCategoryResponse;

    @JsonProperty(value = "product_type")
    private ProductTypeResponse productTypeResponse;
}
