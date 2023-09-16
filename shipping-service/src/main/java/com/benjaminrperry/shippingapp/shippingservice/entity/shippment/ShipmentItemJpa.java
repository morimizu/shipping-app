package com.benjaminrperry.shippingapp.shippingservice.entity.shippment;

import com.benjaminrperry.shippingapp.shippingservice.model.shippment.Shipment;
import com.benjaminrperry.shippingapp.shippingservice.model.shippment.ShipmentItem;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "shipment_item")
@IdClass(ShipmentItemPrimaryKey.class)
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShipmentItemJpa implements ShipmentItem {
    @JoinColumn(name = "shipment_id")
    @ManyToOne(targetEntity = ShipmentJpa.class)
    private Shipment shipment;
    @Id
    @Column(name = "product_number")
    private String productNumber;
    @Column(name = "qty")
    private Integer qty;
    @Column(name = "weight")
    private Double weight;
    @Column(name = "volume")
    private Double volume;

    @Override
    @Id
    public Long getShipmentId() {
        return this.shipment.getId();
    }
}
