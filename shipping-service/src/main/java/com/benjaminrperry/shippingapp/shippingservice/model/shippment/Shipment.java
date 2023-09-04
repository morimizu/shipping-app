package com.benjaminrperry.shippingapp.shippingservice.model.shippment;

import com.benjaminrperry.shippingapp.shippingservice.model.product.Product;

import java.util.List;

public interface Shipment {
    Long getId();

    Double getTotalWeight();

    void setTotalWeight(Double totalWeight);

    Double getTotalVolume();

    void setTotalVolume(Double totalVolume);

    void setShipmentItems(List<ShipmentItem> shipmentItems);

    List<ShipmentItem> getShipmentItems();
}
