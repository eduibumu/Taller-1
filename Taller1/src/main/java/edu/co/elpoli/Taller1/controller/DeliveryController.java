package edu.co.elpoli.Taller1.controller;


import edu.co.elpoli.Taller1.percistence.entity.Delivery;
import edu.co.elpoli.Taller1.services.DeliveryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/delivery")
@RequiredArgsConstructor
public class DeliveryController {

    private final DeliveryService deliveryService;

    @PostMapping
    public Delivery save(@RequestBody Delivery delivery){
        return deliveryService.save(delivery);
    }

    @GetMapping
    public List<Delivery> findAll(){
        return deliveryService.findAll();
    }

}
