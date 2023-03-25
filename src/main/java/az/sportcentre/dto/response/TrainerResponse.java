package az.sportcentre.dto.response;

import az.sportcentre.model.gym.GENDER;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrainerResponse {
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
    private boolean isActive;
}
