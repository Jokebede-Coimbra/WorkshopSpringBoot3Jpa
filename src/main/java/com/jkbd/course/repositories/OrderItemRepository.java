package com.jkbd.course.repositories;

import com.jkbd.course.entities.OrderItem;
import com.jkbd.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
