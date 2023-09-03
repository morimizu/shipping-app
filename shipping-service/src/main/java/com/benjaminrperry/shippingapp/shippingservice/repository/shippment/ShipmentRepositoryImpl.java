package com.benjaminrperry.shippingapp.shippingservice.repository.shippment;

import com.benjaminrperry.shippingapp.shippingservice.entity.shippment.ShipmentJpa;
import com.benjaminrperry.shippingapp.shippingservice.model.shippment.Shipment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ShipmentRepositoryImpl implements ShipmentRepository {

    private final ShipmentJpaRepository shipmentJpaRepository;
    @Override
    public Shipment getShipment(Long shipmentId) {
        return shipmentJpaRepository
                .findById(shipmentId)
                .orElseThrow(() -> new RuntimeException("no shipment found"));
    }

    @Override
    public Shipment save(Shipment shipment) {
        return shipmentJpaRepository.save((ShipmentJpa) shipment);
    }

    @Override
    public void delete(Long shipmentId) {
        shipmentJpaRepository.deleteById(shipmentId);
    }

    @Override
    public Shipment newInstance() {
        return new ShipmentJpa();
    }
}
