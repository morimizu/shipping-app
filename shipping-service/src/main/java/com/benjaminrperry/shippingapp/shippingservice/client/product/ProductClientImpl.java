package com.benjaminrperry.shippingapp.shippingservice.client.product;

import com.benjaminrperry.shippingapp.shippingservice.client.dto.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

@Component
@RequiredArgsConstructor
public class ProductClientImpl implements ProductClient {

    private final WebClient webClient = WebClient.create();

    private final String BASE_URL = "http://localhost:8081/product";

    private final String GET_PRODUCT_URL = BASE_URL + "/{productNumber}";

    @Override
    public ProductDTO getProduct(String productNumber) {
        return webClient.get()
                .uri(GET_PRODUCT_URL.replace("{productNumber}",productNumber))
                .retrieve()
                .toEntity(ProductDTO.class)
                .blockOptional()
                .orElseThrow(() -> new RuntimeException("No Prodcut with id " + productNumber + " found"))
                .getBody();
    }

    @Override
    public Flux<ProductDTO> getAllProducts() {
        return  webClient.get()
                        .uri(BASE_URL)
                        .retrieve()
                        .bodyToFlux(ProductDTO.class);
    }
}
