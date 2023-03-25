package az.sportcentre.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(SportHallNotFoundException.class)
    public ResponseEntity<?> sportHallNotFoundException(SportHallNotFoundException sportHallNotFoundException) {
        List<String> detail = new ArrayList<>();
        detail.add(sportHallNotFoundException.getMessage());

        ErrorResponse errorResponse = new ErrorResponse("Sport Hall not Found !", detail);
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(TrainerAllReadyExistsException.class)
    public ResponseEntity<?> trainerAllReadyExistsException(TrainerAllReadyExistsException trainerAllReadyExistsException) {
        List<String> detail = new ArrayList<>();
        detail.add(trainerAllReadyExistsException.getMessage());

        ErrorResponse errorResponse = new ErrorResponse("Trainer AllReady exists !", detail);
        return new ResponseEntity<>(errorResponse, HttpStatus.ALREADY_REPORTED);
    }

    @ExceptionHandler(TrainerNotFoundException.class)
    public ResponseEntity<?> trainerNotFoundException(TrainerNotFoundException trainerNotFoundException) {
        List<String> detail = new ArrayList<>();
        detail.add(trainerNotFoundException.getMessage());

        ErrorResponse errorResponse = new ErrorResponse("Trainer not Found !", detail);
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
