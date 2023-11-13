package com.benjaminrperry.shippingapp.shippingservice.repository.shippment;

import com.benjaminrperry.shippingapp.shippingservice.entity.shippment.ShipmentItemJpa;
import com.benjaminrperry.shippingapp.shippingservice.entity.shippment.ShipmentItemPrimaryKey;
import com.benjaminrperry.shippingapp.shippingservice.model.shippment.ShipmentItem;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ShipmentItemRepositoryImpl implements ShipmentItemRepository {
    private final ShipmentItemJpaRepository shipmentItemJpaRepository;
    @Override
    public List<ShipmentItem> getShipmentItems(Long shipmentId) {
        return shipmentItemJpaRepository.findByShipmentId(shipmentId).stream()
                .map(ShipmentItem.class::cast)
                .toList();
    }

    @Override
    public ShipmentItem getShipmentItem(Long shipmentId, String productNumber) {
        return shipmentItemJpaRepository
                .findByShipmentIdAndProductNumber(shipmentId, productNumber)
                .orElseThrow(() -> new RuntimeException("shipment item doesn't exist"));
    }

    @Override
    public ShipmentItem save(ShipmentItem shipmentItem) {
        return shipmentItemJpaRepository.save((ShipmentItemJpa) shipmentItem);
    }

    @Override
    public void delete(Long shipmentItemId) {
        shipmentItemJpaRepository.deleteById(shipmentItemId);
    }

    @Override
    public ShipmentItem newInstance() {
        return new ShipmentItemJpa();
    }
}
