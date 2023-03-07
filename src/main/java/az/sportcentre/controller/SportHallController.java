package az.sportcentre.controller;

import az.sportcentre.model.gym.SportHall;
import az.sportcentre.request.SportHallRequest;
import az.sportcentre.service.SportHallService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class SportHallController {
    private final SportHallService service;

    @PostMapping("/hall")
    public void saveHall(@RequestBody SportHallRequest sportHallRequest){
        service.addHall(sportHallRequest);
    }
}
