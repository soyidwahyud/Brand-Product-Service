package com.store.soyidwahyud.brandproductservice.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductPriceRequest {
    @JsonProperty(value = "id_product_price")
    private Long idProductPrice;
    @JsonProperty(value = "product_price_name")
    private String productPriceName;
    @JsonProperty(value = "price")
    private Long price;
}
