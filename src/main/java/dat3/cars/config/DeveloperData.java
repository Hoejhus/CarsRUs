package dat3.cars.config;

import dat3.cars.entity.Car;
import dat3.cars.entity.Member;
import dat3.cars.repository.CarRepository;
import dat3.cars.repository.MemberRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class DeveloperData implements ApplicationRunner {
    CarRepository carRepository;
    MemberRepository memberRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {;
        carRepository.saveAll(generateCars());
        memberRepository.saveAll(generateMembers());
    }

    public DeveloperData(CarRepository carRepository, MemberRepository memberRepository) {
        this.carRepository = carRepository;
        this.memberRepository = memberRepository;

    }

    private List<Member> generateMembers() {
        List<Member> members = new ArrayList<>();
        Random random = new Random();

        String[] firstNames = {"Alice", "Bob", "Charlie", "David", "Emily", "Frank", "Grace", "Hannah", "Isaac", "Jane"};
        String[] lastNames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia", "Martinez", "Wilson"};
        String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Miami", "Atlanta", "Seattle", "Boston", "Dallas", "Denver"};

        for (int i = 1; i <= 20; i++) {
            String username = "user" + i;
            String password = "password" + i;
            String email = "user" + i + "@example.com";
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            String street = i + "th Avenue";
            String city = cities[random.nextInt(cities.length)];
            String zip = "ZIP" + i;

            Member member = new Member(username, password, email, firstName, lastName, street, city, zip);
            member.setRole("USER");
            member.setApproved(true);
            member.setRanking(random.nextInt(1000)); // Assigning a random ranking

            members.add(member);
        }

        return memberRepository.saveAll(members);
    }

    private List<Car> generateCars() {
        List<Car> cars = new ArrayList<>();
        Random random = new Random();

        String[] brands = {"Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Mercedes", "Audi", "Volkswagen"};
        String[] models = {"Sedan", "SUV", "Coupe", "Hatchback", "Convertible"};

        for (int i = 1; i <= 50; i++) {
            String brand = brands[random.nextInt(brands.length)];
            String model = models[random.nextInt(models.length)];
            double price = 500 * random.nextDouble();
            int discount = random.nextInt(21); // 0 to 20

            Car car = new Car(i, brand, model, price, discount);
            cars.add(car);
        }

        return cars;
    }
}
