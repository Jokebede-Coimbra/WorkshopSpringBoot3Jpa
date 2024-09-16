package com.jkbd.course.services;

import com.jkbd.course.entities.Order;
import com.jkbd.course.repositories.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

//    public Order findById(Long id) {
//        Optional<Order> obj = orderRepository.findById(id);
//        return obj.get();
//    }

    @Transactional(readOnly = true)
    public Order findById(Long id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id: " + id));
        log.debug("Order found: " + order);
        log.debug("Order items: " + order.getItems());
        return order;
    }
}
