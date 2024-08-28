package com.jkbd.course.repositories;

import com.jkbd.course.entities.Order;
import com.jkbd.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
