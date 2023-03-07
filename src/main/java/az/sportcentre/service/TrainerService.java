package az.sportcentre.service;

import az.sportcentre.model.gym.SportHall;
import az.sportcentre.model.gym.Trainers;

import java.util.List;

public interface TrainerService {
    void addTrainer(Trainers trainers);
    SportHall getHallById(long id);
    List<SportHall> getALlHall();

}
