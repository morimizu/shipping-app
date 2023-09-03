package com.benjaminrperry.shippingapp.shippingservice.repository.shippment;

import com.benjaminrperry.shippingapp.shippingservice.model.shippment.ShipmentItem;

import java.util.List;

public interface ShipmentItemRepository {
    List<ShipmentItem> getShipmentItems(Long shipmentId);

    ShipmentItem getShipmentItem(Long shipmentId, String productId);

    ShipmentItem save(ShipmentItem shipmentItem);

    void delete(Long shipmentId, String productId);

    ShipmentItem newInstance();
}
