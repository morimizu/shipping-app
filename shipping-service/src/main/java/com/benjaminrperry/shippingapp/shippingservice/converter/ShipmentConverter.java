package com.benjaminrperry.shippingapp.shippingservice.converter;

import com.benjaminrperry.shippingapp.shippingservice.client.dto.ShipmentDTO;
import com.benjaminrperry.shippingapp.shippingservice.model.shippment.Shipment;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ShipmentConverter {
    public static ShipmentDTO toShipmentDTO(Shipment shipment) {
        return ShipmentDTO.builder().build();
    }
}
