package az.sportcentre.service;

import az.sportcentre.dto.request.SportHallRequest;
import az.sportcentre.dto.response.SportHallResponse;
import az.sportcentre.dto.response.SportHallResponseList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SportHallService {
    void addHall(SportHallRequest sportHallRequest);

    SportHallResponse getHallById(Long id);

    List<SportHallResponseList> getALlHall();

    void updateSportHall(Long id, SportHallRequest sportHallRequest);

    void deactivateSportHallService(Long id);

    void addLikeHall(Long id);

    void addDisLikeHall(Long id);
}
