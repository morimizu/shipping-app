package com.benjaminrperry.shippingapp.shippingservice.client.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShipmentItemDTO {
    private String productNumber;
    private Integer qty;
    private Double weight;
    private Double volume;

}
