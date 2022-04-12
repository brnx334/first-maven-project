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
public class Ticket {

    @Id
    private int ticket_id;

    //знаю что будут проблемы с названием столбцов
    // но это полётная версия)
    private int user_id;
    private int eventFilm_id;

//    private User user;
//    private EventFilm eventFilm;
    private int numberTicket;

}
