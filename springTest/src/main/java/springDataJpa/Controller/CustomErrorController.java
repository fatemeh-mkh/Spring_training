package springDataJpa.Controller;

import jakarta.validation.ConstraintDeclarationException;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ControllerAdvice
public class CustomErrorController {


    @ExceptionHandler
    ResponseEntity handleJPAViolations(TransactionSystemException exception){
        ResponseEntity.BodyBuilder responseEntity=ResponseEntity.badRequest();

        if(exception.getCause().getCause() instanceof ConstraintViolationException) {
            ConstraintViolationException vs= (ConstraintViolationException) exception.getCause().getCause();

            List errors = vs.getConstraintViolations().stream()
                    .map(constraintViolation -> {
                        Map<String,String> errorMap= new HashMap<>();
                        errorMap.put(constraintViolation.getPropertyPath().toString(),
                                constraintViolation.getMessage());
                        return errorMap;
                    }).collect(Collectors.toList());

            return responseEntity.body(errors);
        };
        return ResponseEntity.badRequest().build();
    }



    @ExceptionHandler(MethodArgumentNotValidException.class)//Not valid exception
    ResponseEntity handlerBindErrors(MethodArgumentNotValidException exception){

        List errorList=exception.getFieldErrors().stream()
                .map(fieldError -> {
                    Map<String,String > erroeMap= new HashMap<>();
                    erroeMap.put(fieldError.getField(),fieldError.getDefaultMessage());
                    return erroeMap;
                }).collect(Collectors.toList());

        return ResponseEntity.badRequest().body(errorList);
    }
}
