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
    private ShipmentItemJpaRepository shipmentItemJpaRepository;
    @Override
    public List<ShipmentItem> getShipmentItems(Long shipmentId) {
        return shipmentItemJpaRepository.findByShipmentId(shipmentId);
    }

    @Override
    public ShipmentItem getShipmentItem(Long shipmentId, String productNumber) {
        return shipmentItemJpaRepository
                .findById(new ShipmentItemPrimaryKey(shipmentId,productNumber))
                .orElseThrow(() -> new RuntimeException("shipment item doesn't exist"));
    }

    @Override
    public ShipmentItem save(ShipmentItem shipmentItem) {
        return shipmentItemJpaRepository.save((ShipmentItemJpa) shipmentItem);
    }

    @Override
    public void delete(Long shipmentId, String productId) {
        shipmentItemJpaRepository.deleteById(new ShipmentItemPrimaryKey(shipmentId,productId));
    }

    @Override
    public ShipmentItem newInstance() {
        return new ShipmentItemJpa();
    }
}
