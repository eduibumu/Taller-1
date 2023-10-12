package edu.co.elpoli.Taller1.controller;


import edu.co.elpoli.Taller1.percistence.entity.Customer;
import edu.co.elpoli.Taller1.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @GetMapping
    public List<Customer> findAll(){
        return customerService.findAll();
    }
}
