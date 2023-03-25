package az.sportcentre.controller;

import az.sportcentre.dto.request.TrainerRequest;
import az.sportcentre.dto.response.TrainerResponse;
import az.sportcentre.dto.response.TrainerResponseList;
import az.sportcentre.service.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class TrainersController {
    private final TrainerService trainerService;

    @PostMapping("/addTrainer")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void saveTrainer(@RequestBody TrainerRequest trainerRequest) {
        trainerService.addTrainer(trainerRequest);
    }

    @GetMapping("/getTrainer/{id}")
    @ResponseStatus(code = HttpStatus.FOUND)
    public TrainerResponse getTrainersById(@PathVariable Long id) {
        return trainerService.getTrainerById(id);
    }

    @GetMapping("/trainerList")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<TrainerResponseList> getTrainersList() {
        return trainerService.getALlTrainersList();
    }

    @PutMapping("/updateTrainer/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateTrainer(@PathVariable Long id, @RequestBody TrainerRequest trainerRequest) {
        trainerService.updateTrainer(id, trainerRequest);
    }
}
