package com.benjaminrperry.shippingapp.shippingservice.service.shippment;

import com.benjaminrperry.shippingapp.shippingservice.client.dto.CreateShipmentDTO;
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
    private ShipmentRepository shipmentRepository;
    private ShipmentItemRepository shipmentItemRepository;

    private ProductClient productClient;

    public ShipmentDTO createShipment(CreateShipmentDTO createShipmentDTO) {
        Shipment shipment = shipmentRepository.save(shipmentRepository.newInstance());
        return ShipmentConverter.toShipmentDTO(shipment);
    }
}
