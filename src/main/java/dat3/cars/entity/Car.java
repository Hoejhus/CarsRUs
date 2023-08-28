package dat3.cars.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
//-----------------------------
@Entity
@Table(name="car")
public class Car {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String brand;
    String model;
    double pricePrDay;
    int bestDiscount;

    @CreationTimestamp
    LocalDateTime created;

    @UpdateTimestamp
    LocalDateTime lastEdited;

    public Car(int id, String brand, String model, double pricePrDay, int bestDiscount) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.pricePrDay = pricePrDay;
        this.bestDiscount = bestDiscount;
    }
}