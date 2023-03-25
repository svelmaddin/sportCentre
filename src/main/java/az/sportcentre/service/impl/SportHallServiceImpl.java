package az.sportcentre.service.impl;

import az.sportcentre.exception.SportHallNotFoundException;
import az.sportcentre.mapper.ProjectMapping;
import az.sportcentre.model.gym.SportHall;
import az.sportcentre.repository.SportHallRepository;
import az.sportcentre.dto.request.SportHallRequest;
import az.sportcentre.dto.response.SportHallResponse;
import az.sportcentre.dto.response.SportHallResponseList;
import az.sportcentre.service.SportHallService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
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
    public SportHallResponse getHallById(Long id) {
        log.info("SportHallServiceImpl.");
        var sportHall = sportHallRepository.findById(id)
                .orElseThrow(() -> new SportHallNotFoundException("Hall couldn't found with %s id:\"+id"));
        return projectMap.SportHallEntityToResponse(sportHall);
    }

    @Override
    public List<SportHallResponseList> getALlHall() {
        var sportHallList = sportHallRepository.findAll();
        return projectMap.SportHallEntityToResponseList(sportHallList);
    }

    @Override
    public void updateSportHall(Long id, SportHallRequest sportHallRequest) {
        SportHall sportHall = sportHallRepository.findById(id).orElseThrow();
        sportHall.setName(sportHallRequest.getName());
        sportHall.setCategory(sportHallRequest.getCategory());
        sportHall.setPhoneNumber(sportHallRequest.getPhoneNumber());
        sportHall.setEmail(sportHallRequest.getEmail());
        sportHall.setInstagram(sportHallRequest.getInstagram());
        sportHall.setFacebook(sportHallRequest.getFacebook());
        sportHall.setTrainers(sportHallRequest.getTrainers());
        sportHall.setAddress(sportHallRequest.getAddress());
        sportHallRepository.save(sportHall);

    }

    @Override
    public void addLikeHall(Long id) {
        var sportHall = sportHallRepository.findById(id).
                orElseThrow(() -> new RuntimeException());
        sportHall.setLikes(sportHall.getLikes() + 1);
        sportHallRepository.save(sportHall);
    }

    @Override
    public void addDisLikeHall(Long id) {
        var sportHall = sportHallRepository.findById(id).
                orElseThrow(() -> new RuntimeException());
        sportHall.setDisLike(sportHall.getDisLike() + 1);
        sportHallRepository.save(sportHall);
    }

    @Override
    public void deactivateSportHallService(Long id) {
        Optional<SportHall> sportHall = sportHallRepository.findById(id);
        if (sportHall.isPresent()) {
            SportHall sportHall1 = sportHall.get();
            sportHall1.setActive(false);
            sportHallRepository.save(sportHall1);
        }
    }

}
