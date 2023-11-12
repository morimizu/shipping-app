package com.benjaminrperry.shippingapp.shippingservice.repository.product;

import com.benjaminrperry.shippingapp.shippingservice.entity.product.ProductJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<ProductJpa, Long> {
    ProductJpa findByProductNumber(String productNumber);
}
