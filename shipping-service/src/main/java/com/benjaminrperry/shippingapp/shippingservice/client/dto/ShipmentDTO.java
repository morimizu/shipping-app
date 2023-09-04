package com.benjaminrperry.shippingapp.shippingservice.client.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ShipmentDTO {
    private Long id;
    private List<ShipmentItemDTO> shipmentItems;
    private Double totalWeight;
    private Double totalVolume;
}
