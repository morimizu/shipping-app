package com.benjaminrperry.shippingapp.shippingservice.model.shippment;

import com.benjaminrperry.shippingapp.shippingservice.model.product.Product;

public interface Shipment {
    Long getId();

    Double getTotalWeight();

    void setTotalWeight(Double totalWeight);

    Double getTotalVolume();

    void setTotalVolume(Double totalVolume);

    void addProduct(Product product);

    void removeProduct(Product product);
}
