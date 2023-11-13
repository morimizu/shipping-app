package com.benjaminrperry.shippingapp.shippingservice.controller.shippment;

import com.benjaminrperry.shippingapp.shippingservice.client.dto.ProductDTO;
import com.benjaminrperry.shippingapp.shippingservice.client.product.ProductClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductClient productClient;

    @GetMapping
    @ResponseStatus(OK)
    public Flux<ProductDTO> getAllProducts() {
        return productClient.getAllProducts();
    }

    @GetMapping("/{productNumber}")
    public ProductDTO getProduct(@PathVariable(name = "productNumber") String productNumber) {
        return productClient.getProduct(productNumber);
    }
}
