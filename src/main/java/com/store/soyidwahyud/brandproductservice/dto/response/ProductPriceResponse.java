package com.store.soyidwahyud.brandproductservice.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductPriceResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty(value = "id_product_price")
    private Long idProductPrice;

    @JsonProperty(value = "product_price_name")
    private String productPriceName;

    @JsonProperty(value = "price")
    private Long price;
}
