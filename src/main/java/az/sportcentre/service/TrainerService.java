package az.sportcentre.service;
import az.sportcentre.dto.request.TrainerRequest;
import az.sportcentre.dto.response.TrainerResponse;
import az.sportcentre.dto.response.TrainerResponseList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TrainerService {
    void addTrainer(TrainerRequest trainerRequest);
    TrainerResponse getTrainerById(Long id);
    List<TrainerResponseList> getALlTrainersList();
    void updateTrainer(Long id,TrainerRequest trainerRequest);
//    void deActiveTrainer(Long id);
}
