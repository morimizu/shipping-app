package com.benjaminrperry.shippingapp.shippingservice.repository.shippment;

import com.benjaminrperry.shippingapp.shippingservice.entity.shippment.ShipmentItemJpa;
import com.benjaminrperry.shippingapp.shippingservice.entity.shippment.ShipmentItemPrimaryKey;
import com.benjaminrperry.shippingapp.shippingservice.model.shippment.ShipmentItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShipmentItemJpaRepository extends JpaRepository<ShipmentItemJpa, ShipmentItemPrimaryKey> {
    List<ShipmentItem> findByShipmentId(Long shipmentId);
}
