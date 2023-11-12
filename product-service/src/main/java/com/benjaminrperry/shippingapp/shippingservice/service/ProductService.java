package com.benjaminrperry.shippingapp.shippingservice.service;

import com.benjaminrperry.shippingapp.shippingservice.client.dto.CreateProductDto;
import com.benjaminrperry.shippingapp.shippingservice.model.product.Product;
import com.benjaminrperry.shippingapp.shippingservice.repository.product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product createProduct(CreateProductDto createProductDto) {
        return productRepository.create(createProductDto.getProductNumber(), createProductDto.getDescription(), createProductDto.getUnitWeight(), createProductDto.getUnitVolume());
    }

    public Product getProductByProductNumber(String productNumber) {
        return productRepository.getProductByProductNumber(productNumber);
    }

    public List<Product> listAllProducts() {
        return productRepository.getAllProducts();
    }
}
