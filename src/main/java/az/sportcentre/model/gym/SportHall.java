package az.sportcentre.model.gym;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SportHall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String category;
    private String country;
    private String city;
    private String metroStation;
    private String address;
    private String phoneNumber;
    private String email;
    private String instagram;
    private String facebook;

    @OneToMany(mappedBy = "sportHall", cascade = CascadeType.ALL)
    private List<Trainers> trainers;

}
