package az.sportcentre.controller;

import az.sportcentre.model.gym.Trainers;
import az.sportcentre.service.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class TrainersController {
    private final TrainerService trainerService;

    @PostMapping("/trainer")
    public void saveTrainer(@RequestBody Trainers trainers){
        trainerService.addTrainer(trainers);
    }
}
