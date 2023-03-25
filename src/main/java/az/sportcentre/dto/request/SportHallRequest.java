package az.sportcentre.dto.request;

import az.sportcentre.model.gym.Address;
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
    private String phoneNumber;
    private String email;
    private String instagram;
    private String facebook;
    private boolean isActive;
    private List<Trainers> trainers;
    private List<Address> address;
}
