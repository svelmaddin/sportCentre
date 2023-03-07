package az.sportcentre.mapper;

import az.sportcentre.model.gym.SportHall;
import az.sportcentre.request.SportHallRequest;
import az.sportcentre.response.SportHallResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ProjectMapping {

    SportHall SportHallRequestToEntity(SportHallRequest sportHallRequest);

    SportHallResponse SportHallEntityToResponse(SportHall sportHall);



}
