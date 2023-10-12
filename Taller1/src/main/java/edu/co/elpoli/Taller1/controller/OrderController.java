package edu.co.elpoli.Taller1.controller;


import edu.co.elpoli.Taller1.percistence.entity.Order;
import edu.co.elpoli.Taller1.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public Order save(@RequestBody Order order){
        return orderService.save(order);
    }

    @GetMapping
    public List<Order>findAll(){
        return orderService.findAll();
    }
}
