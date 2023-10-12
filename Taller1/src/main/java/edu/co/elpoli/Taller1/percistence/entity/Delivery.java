package edu.co.elpoli.Taller1.percistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name="delivery_id")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deliverys")

    private long deliveryId;
    private String company;
    private String duration;
    private String type;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;
    private List<Delivery> deliveries;


    @JsonManagedReference
    @OneToMany(mappedBy = "delivery", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<Delivery> deliverys;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return deliveryId == delivery.deliveryId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(deliveryId);
    }
}
