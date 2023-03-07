package az.sportcentre.model.gym;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trainers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private GENDER gender;
    private String address;
    private String about;
    private String phoneNumber;
    private String email;
    private String instagram;
    private String facebook;

    @ManyToOne
    @JoinColumn(name = "sport_hall_id")
    private SportHall sportHall;

}
