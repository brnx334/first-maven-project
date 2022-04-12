package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users", schema = "public")
@Entity
public class User {

    @Id
    private int id;
    private String username;
    private String password;
    private String levelAccess;
//    private LevelAccess levelAccess;

}
