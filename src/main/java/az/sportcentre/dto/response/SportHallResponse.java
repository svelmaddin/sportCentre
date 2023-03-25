package az.sportcentre.dto.response;

import az.sportcentre.model.gym.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SportHallResponse {
    private Long id;
    private String name;
    private String category;
    private String phoneNumber;
    private String email;
    private String instagram;
    private String facebook;
    private boolean isActive;
    private int likes;
    private int disLike;

    private List<Address> address;
    private List<TrainerResponse> trainers;
}
