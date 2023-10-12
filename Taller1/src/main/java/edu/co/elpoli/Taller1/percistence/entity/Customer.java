package edu.co.elpoli.Taller1.percistence.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name="customers")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="customer_id" )
    private long customerId;
    private String name;
    private String email;
    private Date birthdate;

    @JsonManagedReference
    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<Order> orders;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }
}
