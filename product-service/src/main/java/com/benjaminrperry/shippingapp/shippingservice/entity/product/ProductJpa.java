package com.benjaminrperry.shippingapp.shippingservice.entity.product;

import com.benjaminrperry.shippingapp.shippingservice.model.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductJpa implements Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "product_Number")
    private String productNumber;

    @Column(name = "description")
    private String description;

    @Column(name = "unit_weight")
    private Double unitWeight;

    @Column(name = "unit_volume")
    private Double unitVolume;
}
