package az.sportcentre.service.impl;

import az.sportcentre.mapper.ProjectMapping;
import az.sportcentre.model.gym.SportHall;
import az.sportcentre.repository.SportHallRepository;
import az.sportcentre.request.SportHallRequest;
import az.sportcentre.service.SportHallService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SportHallServiceImpl implements SportHallService {
    private final SportHallRepository sportHallRepository;
    private final ProjectMapping projectMap = Mappers.getMapper(ProjectMapping.class);

    @Override
    public void addHall(SportHallRequest sportHallRequest) {
        var sportHall = projectMap.SportHallRequestToEntity(sportHallRequest);
        sportHallRepository.save(sportHall);

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
