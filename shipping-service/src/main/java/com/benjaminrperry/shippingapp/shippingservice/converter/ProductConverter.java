package com.benjaminrperry.shippingapp.shippingservice.converter;

import com.benjaminrperry.shippingapp.shippingservice.client.dto.ProductDTO;
import com.benjaminrperry.shippingapp.shippingservice.model.product.Product;
import com.benjaminrperry.shippingapp.shippingservice.model.product.ProductModel;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ProductConverter {
    public static ProductDTO toDto(Product model) {
        return ProductDTO.builder()
                .productNumber(model.getProductNumber())
                .description(model.getDescription())
                .unitWeight(model.getUnitWeight())
                .unitVolume(model.getUnitVolume())
                .build();
    }
    public static ProductModel toModel(ProductDTO dto) {
        return ProductModel.builder()
                .productNumber(dto.getProductNumber())
                .description(dto.getDescription())
                .unitWeight(dto.getUnitWeight())
                .unitVolume(dto.getUnitVolume())
                .build();
    }
}
