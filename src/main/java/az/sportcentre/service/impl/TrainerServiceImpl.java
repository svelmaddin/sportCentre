package az.sportcentre.service.impl;

import az.sportcentre.exception.TrainerNotFoundException;
import az.sportcentre.mapper.ProjectMapping;
import az.sportcentre.repository.TrainerRepository;
import az.sportcentre.dto.request.TrainerRequest;
import az.sportcentre.dto.response.TrainerResponse;
import az.sportcentre.dto.response.TrainerResponseList;
import az.sportcentre.service.TrainerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class TrainerServiceImpl implements TrainerService {
    private final TrainerRepository trainerRepository;
    private final ProjectMapping projectMapping = Mappers.getMapper(ProjectMapping.class);

    @Override
    public void addTrainer(TrainerRequest trainerRequest) {
        var trainer = projectMapping.TrainerRequestToEntity(trainerRequest);
        trainerRepository.save(trainer);
    }

    @Override
    public TrainerResponse getTrainerById(Long id) {
        var trainer = trainerRepository.findById(id)
                .orElseThrow(() -> new TrainerNotFoundException("Trainer couldn't found with %s id:"+id));
        return projectMapping.TrainerEntityToResponse(trainer);

    }

    @Override
    public List<TrainerResponseList> getALlTrainersList() {
        var trainer = trainerRepository.findAll();
        return projectMapping.TrainerEntityToResponseList(trainer);
    }

    @Override
    public void updateTrainer(Long id, TrainerRequest trainerRequest) {
        var trainers = trainerRepository.findById(id)
                .orElseThrow(()-> new TrainerNotFoundException("Trainer couldn't found with %s id:" +id));
        trainers.setName(trainerRequest.getName());
        trainers.setSurname(trainerRequest.getSurname());
        trainers.setGender(trainerRequest.getGender());
        trainers.setAddress(trainerRequest.getAddress());
        trainers.setAbout(trainerRequest.getAbout());
        trainers.setPhoneNumber(trainerRequest.getPhoneNumber());
        trainers.setEmail(trainerRequest.getEmail());
        trainers.setInstagram(trainerRequest.getInstagram());
        trainers.setFacebook(trainerRequest.getFacebook());
        trainers.setSportHall(trainerRequest.getSportHall());
        trainerRepository.save(trainers);
    }
//
//    @Override
//    public void deActiveTrainer(Long id) {
//        var trainer = trainerRepository.findById(id).orElseThrow(()-> new TrainerNotFoundException("Trainer couldn't found with %s id:" +id));
//        trainer.setActive(false);
//        trainerRepository.save(trainer);
//    }
}
