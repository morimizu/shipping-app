package com.benjaminrperry.shippingapp.shippingservice.client.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class CreateShipmentDTO {
    private List<AddShipmentItemDTO> shipmentItems;
}
