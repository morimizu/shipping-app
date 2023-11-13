package com.benjaminrperry.shippingapp.shippingservice.repository.shippment;

import com.benjaminrperry.shippingapp.shippingservice.entity.shippment.ShipmentItemJpa;
import com.benjaminrperry.shippingapp.shippingservice.entity.shippment.ShipmentItemPrimaryKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface ShipmentItemJpaRepository extends JpaRepository<ShipmentItemJpa, Long> {
    List<ShipmentItemJpa> findByShipmentId(Long shipmentId);

    Optional<ShipmentItemJpa> findByShipmentIdAndProductNumber(Long shipmentId, String productNumber);
}
