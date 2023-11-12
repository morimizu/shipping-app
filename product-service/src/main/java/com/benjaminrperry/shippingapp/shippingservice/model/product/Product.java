package com.benjaminrperry.shippingapp.shippingservice.model.product;

public interface Product {
    String getProductNumber();

    String getDescription();

    Double getUnitWeight();

    Double getUnitVolume();
}
