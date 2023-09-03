package com.benjaminrperry.shippingapp.shippingservice.client.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddShipmentItemDTO {
    private String productNumber;
    private Integer qty;
}
