package com.benjaminrperry.shippingapp.orderservice.repository.order;

import com.benjaminrperry.shippingapp.orderservice.entity.order.OrderJpa;
import com.benjaminrperry.shippingapp.orderservice.entity.order.OrderLineJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineJpaRepository extends JpaRepository<OrderLineJpa, Long> {
}
