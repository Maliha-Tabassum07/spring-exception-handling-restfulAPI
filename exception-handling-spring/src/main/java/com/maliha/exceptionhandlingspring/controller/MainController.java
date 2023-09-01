package com.maliha.exceptionhandlingspring.controller;


import com.maliha.exceptionhandlingspring.service.AnimalService;
import com.maliha.exceptionhandlingspring.service.ExceptionTestingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.InputMismatchException;

@RestController
public class MainController {
    @Autowired
    private ExceptionTestingService exceptionTestingService;

    @Autowired
    private AnimalService animalService;
    @GetMapping("/arrayIterate")
    public ResponseEntity<?> arrayService(@RequestParam Integer a)throws ArrayIndexOutOfBoundsException{
        return  new ResponseEntity<>(exceptionTestingService.arrayIterate(a), HttpStatus.OK);
    }
    @GetMapping("/string")
    public ResponseEntity<?> stringService(@RequestParam String a)throws NullPointerException{
        return  new ResponseEntity<>(exceptionTestingService.stringCreator(a), HttpStatus.OK);
    }
    @GetMapping("/string/Animal")
    public ResponseEntity<?> stringServiceAnimal(@RequestParam String inputAlphabet)throws InputMismatchException{
        return  new ResponseEntity<>(animalService.findById(inputAlphabet), HttpStatus.OK);
    }


}
