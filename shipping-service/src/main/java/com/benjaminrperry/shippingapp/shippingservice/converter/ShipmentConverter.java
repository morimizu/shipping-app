package com.benjaminrperry.shippingapp.shippingservice.converter;


import com.benjaminrperry.shippingapp.shippingservice.client.dto.ShipmentDTO;
import com.benjaminrperry.shippingapp.shippingservice.client.dto.ShipmentItemDTO;
import com.benjaminrperry.shippingapp.shippingservice.model.shippment.Shipment;
import com.benjaminrperry.shippingapp.shippingservice.model.shippment.ShipmentItem;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ShipmentConverter {
    public static ShipmentDTO toShipmentDTO(Shipment shipment) {
        return ShipmentDTO.builder()
                .id(shipment.getId())
                .shipmentItems(shipment.getShipmentItems().stream()
                        .map(ShipmentConverter::toShipmentItemDTO)
                        .toList())
                .totalWeight(shipment.getTotalWeight())
                .totalVolume(shipment.getTotalVolume())
                .build();
    }

    public static ShipmentItemDTO toShipmentItemDTO(ShipmentItem shipmentItem) {
        return ShipmentItemDTO.builder()
                .productNumber(shipmentItem.getProductNumber())
                .qty(shipmentItem.getQty())
                .weight(shipmentItem.getWeight())
                .volume(shipmentItem.getVolume())
                .build();
    }
}
