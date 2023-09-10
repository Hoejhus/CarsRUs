package dat3.car.config;

import dat3.car.entity.Car;
import dat3.car.entity.Member;
import dat3.car.entity.Reservation;
import dat3.car.repository.CarRepository;
import dat3.car.repository.MemberRepository;
import dat3.car.repository.ReservationRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class DeveloperData implements ApplicationRunner {

  MemberRepository memberRepository;
  CarRepository carRepository;
  ReservationRepository reservationRepository;

  public DeveloperData(MemberRepository memberRepository, CarRepository carRepository, ReservationRepository reservationRepository) {
    this.memberRepository = memberRepository;
    this.carRepository = carRepository;
    this.reservationRepository = reservationRepository;
  }

  //Obviously this data setup must never be used in production
  private final String passwordUsedByAll = "test12";

  @Override
  public void run(ApplicationArguments args) throws Exception {
    List<Member> members = MemberTestDataFactory.generateTestMembers("test12");
    memberRepository.saveAll(members);
    List<Car> cars = CarTestDataFactory.generateTestCars();
    carRepository.saveAll(cars);


    Car car1 = new Car("Ford", "Mustang", 1000, 10);
    Member mem1 = new Member("Mikkel", "Username", "email", "firstName", "lastName", "street", "city", "zip");
    carRepository.save(car1);
    memberRepository.save(mem1);

    LocalDate date = LocalDate.now().plusDays(2);
    LocalDate date2 = LocalDate.now().plusDays(3);
    Reservation r1 = new Reservation(mem1, car1, date);
    Reservation r2 = new Reservation(mem1, car1, date2);
    reservationRepository.save(r1);
    reservationRepository.save(r2);

  }



}
