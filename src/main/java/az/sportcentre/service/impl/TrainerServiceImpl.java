package az.sportcentre.service.impl;

import az.sportcentre.model.gym.SportHall;
import az.sportcentre.model.gym.Trainers;
import az.sportcentre.repository.SportHallRepository;
import az.sportcentre.repository.TrainerRepository;
import az.sportcentre.service.SportHallService;
import az.sportcentre.service.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrainerServiceImpl implements TrainerService {
    private final TrainerRepository trainerRepository;


    @Override
    public void addTrainer(Trainers trainers) {

        trainerRepository.save(trainers);
    }

    @Override
    public SportHall getHallById(long id) {
        return null;
    }

    @Override
    public List<SportHall> getALlHall() {
        return null;
    }
}
