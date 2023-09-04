package com.benjaminrperry.shippingapp.shippingservice.client.product;

import com.benjaminrperry.shippingapp.shippingservice.client.dto.ProductDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductClientImpl implements ProductClient {
    @Override
    public ProductDTO getProduct(String productNumber) {
        return ProductDTO.builder()
                .productNumber(productNumber)
                .description("Test Product")
                .unitWeight(2d)
                .unitVolume(2d)
                .build();
    }
}
