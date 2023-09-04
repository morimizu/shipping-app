package com.benjaminrperry.shippingapp.shippingservice.repository.shippment;

import com.benjaminrperry.shippingapp.shippingservice.entity.shippment.ShipmentItemJpa;
import com.benjaminrperry.shippingapp.shippingservice.entity.shippment.ShipmentItemPrimaryKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ShipmentItemJpaRepository extends JpaRepository<ShipmentItemJpa, ShipmentItemPrimaryKey> {
}
