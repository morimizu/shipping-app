package com.benjaminrperry.shippingapp.shippingservice.entity.shippment;

import com.benjaminrperry.shippingapp.shippingservice.model.product.Product;
import com.benjaminrperry.shippingapp.shippingservice.model.shippment.Shipment;
import com.benjaminrperry.shippingapp.shippingservice.model.shippment.ShipmentItem;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

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
    private Double totalWeight = 0d;

    @Column(name = "totalVolume")
    private Double totalVolume = 0d;

    @OneToMany(mappedBy = "shipmentId")
    private List<ShipmentItemJpa> shipmentItems;

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
    public void setShipmentItems(List<ShipmentItem> shipmentItems) {
        this.shipmentItems = shipmentItems.stream().map((item) -> (ShipmentItemJpa) item).toList();
    }

    @Override
    public List<ShipmentItem> getShipmentItems() {
        return this.shipmentItems.stream().map((item) -> (ShipmentItem) item).toList();
    }
}
