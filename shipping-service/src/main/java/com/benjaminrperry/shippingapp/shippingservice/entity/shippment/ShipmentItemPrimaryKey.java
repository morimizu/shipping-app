package com.benjaminrperry.shippingapp.shippingservice.entity.shippment;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ShipmentItemPrimaryKey implements Serializable {
    private Long shipmentId;
    private String productNumber;
}
