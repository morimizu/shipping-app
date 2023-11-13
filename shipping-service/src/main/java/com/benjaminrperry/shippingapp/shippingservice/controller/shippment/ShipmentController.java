package com.benjaminrperry.shippingapp.shippingservice.controller.shippment;

import com.benjaminrperry.shippingapp.shippingservice.client.dto.CreateShipmentDTO;
import com.benjaminrperry.shippingapp.shippingservice.client.dto.ShipmentDTO;
import com.benjaminrperry.shippingapp.shippingservice.service.shippment.ShipmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shipment")
@RequiredArgsConstructor
public class ShipmentController {

    private final ShipmentService shipmentService;

    @PostMapping
    public ShipmentDTO createShipment(@RequestBody CreateShipmentDTO createShipmentDTO) {
        return shipmentService.createShipment(createShipmentDTO);
    }
}
