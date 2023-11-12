package com.benjaminrperry.shippingapp.shippingservice.client.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDTO {
    private String productNumber;
    private String description;
    private Double unitWeight;
    private Double unitVolume;
}
