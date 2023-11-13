package com.benjaminrperry.shippingapp.shippingservice.client.product;

import com.benjaminrperry.shippingapp.shippingservice.client.dto.ProductDTO;
import reactor.core.publisher.Flux;

import java.util.List;

public interface ProductClient {
    ProductDTO getProduct(String productNumber);

    Flux<ProductDTO> getAllProducts();
}
