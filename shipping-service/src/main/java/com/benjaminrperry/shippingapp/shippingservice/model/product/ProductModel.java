package com.benjaminrperry.shippingapp.shippingservice.model.product;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductModel implements Product {
    private Long id;
    private String productNumber;
    private String description;
    private Double unitWeight;
    private Double unitVolume;
}
