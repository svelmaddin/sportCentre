package az.sportcentre.request;

import az.sportcentre.model.gym.Trainers;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SportHallRequest {
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

    private List<Trainers> trainers;
}
