package edu.co.elpoli.Taller1.services;

import edu.co.elpoli.Taller1.percistence.entity.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);
    List<Customer> findAll();
}
