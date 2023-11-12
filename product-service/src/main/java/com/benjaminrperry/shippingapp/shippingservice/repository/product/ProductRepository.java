package com.benjaminrperry.shippingapp.shippingservice.repository.product;

import com.benjaminrperry.shippingapp.shippingservice.entity.product.ProductJpa;
import com.benjaminrperry.shippingapp.shippingservice.model.product.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepository {
    private final ProductJpaRepository productJpaRepository;

    public Product create(String productNumber, String description, Double unitWeight, Double unitVolume) {
        return productJpaRepository.save(buildJpa(productNumber, description, unitWeight, unitVolume));
    }

    public Product update(Product product) {
        return productJpaRepository.save((ProductJpa) product);
    }

    public Product getProductByProductNumber(String productNumber) {
        return productJpaRepository.findByProductNumber(productNumber);
    }

    public List<Product> getAllProducts() {
        return productJpaRepository.findAll().stream()
                .map(Product.class::cast)
                .toList();
    }

    private ProductJpa buildJpa(String productNumber, String description, Double unitWeight, Double unitVolume) {
       return ProductJpa.builder()
                .productNumber(productNumber)
                .description(description)
                .unitWeight(unitWeight)
                .unitVolume(unitVolume)
                .build();
    }


}
