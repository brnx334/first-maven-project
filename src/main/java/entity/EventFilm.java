package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class EventFilm {

    @Id
    private int eventFilm_id;
    private LocalDate date;
    private int hall_id;
    private int film_id;
    private int freeSeats;

//    private Hall hall;
//    private Film film;

}
