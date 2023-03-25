package az.sportcentre.model.gym;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SportHall {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Hall_ID")
    private long id;
    private String name;
    private String category;
    private String phoneNumber;
    private String email;
    private boolean isActive;
    private String instagram;
    private String facebook;
    private int likes;
    private int disLike;

    @OneToMany(mappedBy = "sportHall", cascade = CascadeType.ALL)
    private List<Trainers> trainers;

    @JsonIgnore
    @OneToMany(mappedBy = "sportHall", cascade = CascadeType.ALL)
    private List<Address> address;


}
