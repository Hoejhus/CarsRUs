package dat3.car.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ReservationRequest {

    // TODO

    int carId;
    String username;
    //@JsonFormat(pattern = "dd-MM-yyyy")
}
