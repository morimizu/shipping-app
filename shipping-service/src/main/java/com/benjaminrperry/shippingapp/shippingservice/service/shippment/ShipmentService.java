package com.benjaminrperry.shippingapp.shippingservice.service.shippment;

import com.benjaminrperry.shippingapp.shippingservice.client.dto.AddShipmentItemDTO;
import com.benjaminrperry.shippingapp.shippingservice.client.dto.CreateShipmentDTO;
import com.benjaminrperry.shippingapp.shippingservice.client.dto.ProductDTO;
import com.benjaminrperry.shippingapp.shippingservice.client.dto.ShipmentDTO;
import com.benjaminrperry.shippingapp.shippingservice.client.product.ProductClient;
import com.benjaminrperry.shippingapp.shippingservice.converter.ShipmentConverter;
import com.benjaminrperry.shippingapp.shippingservice.model.shippment.Shipment;
import com.benjaminrperry.shippingapp.shippingservice.model.shippment.ShipmentItem;
import com.benjaminrperry.shippingapp.shippingservice.repository.shippment.ShipmentItemRepository;
import com.benjaminrperry.shippingapp.shippingservice.repository.shippment.ShipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShipmentService {
    private final ShipmentRepository shipmentRepository;
    private final ShipmentItemRepository shipmentItemRepository;
    private final ProductClient productClient;

    public ShipmentDTO createShipment(CreateShipmentDTO createShipmentDTO) {
        Shipment shipment = shipmentRepository.newInstance();
        addItems(shipment, createShipmentDTO.getShipmentItems());
        return ShipmentConverter.toShipmentDTO(shipment);
    }

    private ProductDTO getProduct(String productNumber) {
        return productClient.getProduct(productNumber);
    }

    private void addItems(Shipment shipment, List<AddShipmentItemDTO> addShipmentItems) {
        List<ShipmentItem> shipmentItems = addShipmentItems.stream().map((item) -> {
           var shipmentItem = createItem(item);
           shipment.setTotalWeight(shipment.getTotalWeight() + shipmentItem.getWeight());
           shipment.setTotalVolume(shipment.getTotalVolume() + shipmentItem.getVolume());
           return shipmentItem;
        }).toList();
        shipment.setShipmentItems(shipmentItems);
    }

    private ShipmentItem createItem(AddShipmentItemDTO addShipmentItemDTO) {
        ProductDTO product = getProduct(addShipmentItemDTO.getProductNumber());
        ShipmentItem item = shipmentItemRepository.newInstance();
        item.setProductNumber(addShipmentItemDTO.getProductNumber());
        item.setQty(addShipmentItemDTO.getQty());
        item.setWeight(product.getUnitWeight() * item.getQty());
        item.setVolume(product.getUnitVolume() * item.getQty());
        return item;
    }
}
