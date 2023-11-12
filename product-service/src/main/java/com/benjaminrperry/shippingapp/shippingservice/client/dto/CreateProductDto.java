package com.benjaminrperry.shippingapp.shippingservice.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductDto implements Serializable {
    private String productNumber;
    private String description;
    private Double unitWeight;
    private Double unitVolume;
}
