package edu.co.elpoli.Taller1.percistence.repository;


import edu.co.elpoli.Taller1.percistence.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

}



