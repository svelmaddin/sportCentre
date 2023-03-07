package az.sportcentre.service;

import az.sportcentre.model.gym.SportHall;
import az.sportcentre.request.SportHallRequest;

import java.util.List;

public interface SportHallService {
    void addHall(SportHallRequest sportHallRequest);
    SportHall getHallById(long id);
    List<SportHall> getALlHall();
}
