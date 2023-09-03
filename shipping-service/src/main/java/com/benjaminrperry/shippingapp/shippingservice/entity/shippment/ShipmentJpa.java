package com.benjaminrperry.shippingapp.shippingservice.entity.shippment;

import com.benjaminrperry.shippingapp.shippingservice.model.product.Product;
import com.benjaminrperry.shippingapp.shippingservice.model.shippment.Shipment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShipmentJpa implements Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "totalWeight")
    private Double totalWeight;

    @Column(name = "totalVolume")
    private Double totalVolume;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public Double getTotalWeight() {
        return totalWeight;
    }

    @Override
    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    @Override
    public Double getTotalVolume() {
        return this.totalVolume;
    }

    @Override
    public void setTotalVolume(Double totalVolume) {
        this.totalVolume = totalVolume;
    }

    @Override
    public void addProduct(Product product) {
        return;
    }

    @Override
    public void removeProduct(Product product) {

    }
}
