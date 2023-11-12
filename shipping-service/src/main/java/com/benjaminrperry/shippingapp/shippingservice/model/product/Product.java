package com.benjaminrperry.shippingapp.shippingservice.model.product;

public interface Product {
    Long getId();
    String getProductNumber();

    Double getUnitWeight();

    Double getUnitVolume();
}
