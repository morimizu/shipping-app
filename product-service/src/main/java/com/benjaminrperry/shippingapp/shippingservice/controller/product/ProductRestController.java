package com.benjaminrperry.shippingapp.shippingservice.controller.product;

import com.benjaminrperry.shippingapp.shippingservice.client.dto.CreateProductDto;
import com.benjaminrperry.shippingapp.shippingservice.client.dto.ProductDTO;
import com.benjaminrperry.shippingapp.shippingservice.converter.ProductConverter;
import com.benjaminrperry.shippingapp.shippingservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.benjaminrperry.shippingapp.shippingservice.converter.ProductConverter.toDto;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductRestController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(CREATED)
    public ProductDTO createProduct(@RequestBody CreateProductDto createProductDto) {
        return toDto(productService.createProduct(createProductDto));
    }

    @GetMapping
    @ResponseStatus(OK)
    public List<ProductDTO> listAllProducts() {
        return  productService.listAllProducts().stream()
                .map(ProductConverter::toDto)
                .toList();
    }

    @GetMapping("/{productNumber}")
    @ResponseStatus(OK)
    public ProductDTO getProduct(@PathVariable(name = "productNumber") String productNumber) {
        return toDto(productService.getProductByProductNumber(productNumber));
    }


}
