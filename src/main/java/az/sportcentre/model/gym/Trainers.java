package az.sportcentre.model.gym;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Trainers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String surname;
    private GENDER gender;
    private String address;
    private String about;
    private String phoneNumber;
    private String email;
    private boolean isActive;
    private String instagram;
    private String facebook;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="hall_id")
    private SportHall sportHall;

}
