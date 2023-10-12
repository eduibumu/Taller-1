package edu.co.elpoli.Taller1.services;

import edu.co.elpoli.Taller1.percistence.entity.Delivery;

import java.util.List;

public interface DeliveryService {

    Delivery save(Delivery delivery);
    List<Delivery> findAll();
}
