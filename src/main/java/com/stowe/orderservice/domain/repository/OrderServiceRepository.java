package com.stowe.orderservice.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stowe.orderservice.domain.model.OrderService;

@Repository
public interface OrderServiceRepository extends JpaRepository<OrderService, Long>{

}
