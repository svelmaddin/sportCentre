package az.sportcentre.repository;

import az.sportcentre.model.gym.Trainers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TrainerRepository extends JpaRepository<Trainers ,Long> {

//    Optional<Trainers> findByActive(boolean isActive);
}
