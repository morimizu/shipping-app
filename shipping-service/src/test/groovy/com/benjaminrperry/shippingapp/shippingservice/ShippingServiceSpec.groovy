package com.benjaminrperry.shippingapp.shippingservice


import com.benjaminrperry.shippingapp.shippingservice.client.dto.AddShipmentItemDTO
import com.benjaminrperry.shippingapp.shippingservice.client.dto.CreateShipmentDTO
import com.benjaminrperry.shippingapp.shippingservice.client.dto.ProductDTO
import com.benjaminrperry.shippingapp.shippingservice.service.shippment.ShipmentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = ShippingAppApplication)
class ShippingServiceSpec extends Specification {

    @Autowired
    ShipmentService shipmentService


    def 'can add shipment' () {
        given:
        def dto = CreateShipmentDTO.builder()
                .shipmentItems([
                        AddShipmentItemDTO.builder()
                                .productNumber("ABC1234")
                                .qty(3)
                                .build()
                ])
                .build()

        when:
        def shipment = shipmentService.createShipment(dto)

        then:
        shipment
        shipment.shipmentItems.size() == 1
        shipment.totalWeight == 6
        shipment.totalVolume == 6
    }

    def 'can get shipment'(){
        given:
        def dto = CreateShipmentDTO.builder()
                .shipmentItems([
                        AddShipmentItemDTO.builder()
                                .productNumber("ABC1234")
                                .qty(3)
                                .build()
                ])
                .build()
        def shipment = shipmentService.createShipment(dto)

        when:
        def result = shipmentService.getShipment(shipment.id)

        then:
        result == shipment
    }

    def product(productNumber,weight,volume) {
        return ProductDTO.builder()
                .productNumber(productNumber)
                .description("Test Product")
                .unitWeight(weight)
                .unitVolume(volume)
                .build()
    }

}