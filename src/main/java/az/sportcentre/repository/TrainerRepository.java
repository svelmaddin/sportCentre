package az.sportcentre.repository;

import az.sportcentre.model.gym.Trainers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository<Trainers , Long> {
    
}
