package com.benjaminrperry.shippingapp.orderservice.repository.order;

import com.benjaminrperry.shippingapp.orderservice.entity.order.OrderJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJpaRepository extends JpaRepository<OrderJpa, Long> {
}
