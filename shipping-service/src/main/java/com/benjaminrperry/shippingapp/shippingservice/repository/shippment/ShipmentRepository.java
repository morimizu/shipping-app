package com.benjaminrperry.shippingapp.shippingservice.repository.shippment;

import com.benjaminrperry.shippingapp.shippingservice.model.shippment.Shipment;

public interface ShipmentRepository {
    Shipment getShipment(Long shipmentId);
    Shipment save(Shipment shipment);
    void delete(Long shipmentId);
    Shipment newInstance();
}
