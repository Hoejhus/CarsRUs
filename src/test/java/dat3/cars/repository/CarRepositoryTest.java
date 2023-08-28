package dat3.cars.repository;


import dat3.cars.entity.Car;
import dat3.cars.repository.CarRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class CarRepositoryTest {

    @Autowired
    CarRepository carRepository;

    boolean isInitialized = false;

    @BeforeEach
    public void setUp(){
        if(!isInitialized){
            carRepository.deleteAll();
            carRepository.save(new Car(1, "Toyota", "Sedan", 600.0, 10));
            carRepository.save(new Car(2, "Honda", "SUV", 750.0, 15));
            carRepository.save(new Car(3, "Ford", "Coupe", 550.0, 8));
            carRepository.save(new Car(4, "BMW", "Hatchback", 900.0, 12));
            carRepository.save(new Car(5, "Mercedes", "Convertible", 1200.0, 18));
            isInitialized = true;
        }
    }

    @Test
    public void testAll(){
        assertEquals(5, carRepository.count());
    }

    @Test
    public void deleteAll(){
        carRepository.deleteAll();
        assertEquals(0, carRepository.count());
    }
}
