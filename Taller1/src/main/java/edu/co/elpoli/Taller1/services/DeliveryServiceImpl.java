package edu.co.elpoli.Taller1.services;


import edu.co.elpoli.Taller1.percistence.entity.Delivery;
import edu.co.elpoli.Taller1.percistence.repository.DeliveryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeliveryServiceImpl implements DeliveryService{
    private final DeliveryRepository deliveryRepository;

    @Override
    public Delivery save(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    @Override
    public List<Delivery> findAll() {
        return deliveryRepository.findAll();
    }
}
