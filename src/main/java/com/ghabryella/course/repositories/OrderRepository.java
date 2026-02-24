package com.ghabryella.course.repositories;

import com.ghabryella.course.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
