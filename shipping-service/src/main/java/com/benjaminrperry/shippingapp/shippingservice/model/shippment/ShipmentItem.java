package com.benjaminrperry.shippingapp.shippingservice.model.shippment;

public interface ShipmentItem {
    Long getShipmentId();
    String getProductNumber();
    Double getQty();
    void setQty(Integer qty);
    Double getWeight();
    void setWeight(Double weight);
    Double getVolume();
    void setVolume(Double volume);
}
