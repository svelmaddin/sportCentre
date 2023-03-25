package az.sportcentre.dto.request;

import az.sportcentre.model.gym.GENDER;
import az.sportcentre.model.gym.SportHall;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainerRequest {
    private String name;
    private String surname;
    private GENDER gender;
    private String address;
    private String about;
    private String phoneNumber;
    private String email;
    private String instagram;
    private String facebook;
    private boolean isActive;
    private SportHall sportHall;

}
