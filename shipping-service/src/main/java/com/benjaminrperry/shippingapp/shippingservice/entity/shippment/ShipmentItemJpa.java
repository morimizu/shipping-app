package com.benjaminrperry.shippingapp.shippingservice.entity.shippment;

import com.benjaminrperry.shippingapp.shippingservice.model.shippment.Shipment;
import com.benjaminrperry.shippingapp.shippingservice.model.shippment.ShipmentItem;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "shipment_item")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShipmentItemJpa implements ShipmentItem {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "shipment_id")
    private Long shipmentId;

    @Column(name = "product_number")
    private String productNumber;

    @Column(name = "qty")
    private Integer qty;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "volume")
    private Double volume;
}
