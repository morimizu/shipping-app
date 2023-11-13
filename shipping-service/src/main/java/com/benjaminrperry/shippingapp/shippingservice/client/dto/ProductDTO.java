package com.benjaminrperry.shippingapp.shippingservice.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private String productNumber;
    private String description;
    private Double unitWeight;
    private Double unitVolume;
}
