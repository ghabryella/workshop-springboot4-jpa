package com.ghabryella.course.repositories;

import com.ghabryella.course.entities.OrderItem;
import com.ghabryella.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
