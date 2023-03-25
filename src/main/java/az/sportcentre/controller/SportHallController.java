package az.sportcentre.controller;

import az.sportcentre.dto.request.SportHallRequest;
import az.sportcentre.dto.response.SportHallResponse;
import az.sportcentre.dto.response.SportHallResponseList;
import az.sportcentre.model.gym.SportHall;
import az.sportcentre.model.gym.Trainers;
import az.sportcentre.repository.SportHallRepository;
import az.sportcentre.service.SportHallService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class SportHallController {
    private final SportHallService service;

    @PostMapping("/saveHall")
    public void saveHall(@RequestBody SportHallRequest sportHallRequest){
        service.addHall(sportHallRequest);
    }

    @GetMapping("/getHall/{id}")
    public SportHallResponse getSportHallById(@PathVariable Long id){
        return service.getHallById(id);
    }

    @GetMapping("/getHall")
    public List<SportHallResponseList> getSportHallList(){
        return service.getALlHall();
    }

    @PutMapping("/update/{id}")
    public void updateSportHall(@PathVariable Long id , @RequestBody SportHallRequest sportHallRequest){
        service.updateSportHall(id,sportHallRequest);
    }
    @PostMapping("/{id}/deactivateHall")
    public void deactivateServiceSportHall(@PathVariable Long id) {
        service.deactivateSportHallService(id);
    }


    @PutMapping("/like/{id}")
    public void likeSportHall(@PathVariable Long id){
        service.addLikeHall(id);
    }
    @PutMapping("/disLike/{id}")
    public void disLikeSportHall(@PathVariable Long id){
        service.addDisLikeHall(id);
    }

//    @PostMapping("/{id}/deactivateHall")
//    public ResponseEntity<Void> deactivateService(@PathVariable Long id) {
//        Optional<SportHall> sportHall = sportHallRepository.findById(id);
//        if (sportHall.isPresent()) {
//            SportHall sportHall1 = sportHall.get();
//            sportHall1.setActive(false);
//            sportHallRepository.save(sportHall1);
//            return ResponseEntity.ok().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
}
