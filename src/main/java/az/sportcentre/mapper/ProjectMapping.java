package az.sportcentre.mapper;

import az.sportcentre.model.gym.SportHall;
import az.sportcentre.model.gym.Trainers;
import az.sportcentre.dto.request.SportHallRequest;
import az.sportcentre.dto.request.TrainerRequest;
import az.sportcentre.dto.response.SportHallResponse;
import az.sportcentre.dto.response.SportHallResponseList;
import az.sportcentre.dto.response.TrainerResponse;
import az.sportcentre.dto.response.TrainerResponseList;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProjectMapping {

    SportHall SportHallRequestToEntity(SportHallRequest sportHallRequest);

    SportHallResponse SportHallEntityToResponse(SportHall sportHall);

    List<SportHallResponseList> SportHallEntityToResponseList(List<SportHall> sportHall);

    //
    Trainers TrainerRequestToEntity(TrainerRequest trainerRequest);

    TrainerResponse TrainerEntityToResponse(Trainers trainers);

    List<TrainerResponseList> TrainerEntityToResponseList(List<Trainers> trainers);



}
