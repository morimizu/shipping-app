package com.benjaminrperry.shippingapp.shippingservice.model.product;

public interface Product {
    Long getId();
    String getProductNumber();

    String getDescription();

    Double getUnitWeight();

    Double getUnitVolume();
}
