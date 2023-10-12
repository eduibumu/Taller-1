package edu.co.elpoli.Taller1.services;

import edu.co.elpoli.Taller1.percistence.entity.Customer;
import edu.co.elpoli.Taller1.percistence.entity.Order;

import java.util.List;

public interface OrderService {

    Order save(Order order);
    List<Order> findAll();
}
