package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Hall {
    @Id
    private int hall_id;
    private String name;
    private String description;
    private int cinema_id;
    private int amountOfSeats;

    //    private Cinema cinema;
}
