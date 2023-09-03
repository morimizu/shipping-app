package com.benjaminrperry.shippingapp.shippingservice.client.product;

import com.benjaminrperry.shippingapp.shippingservice.client.dto.ProductDTO;

public interface ProductClient {
    ProductDTO getProduct(String productNumber);
}
