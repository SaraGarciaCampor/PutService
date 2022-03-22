package org.sara.putservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.sara.putservice.entities.Car;
import org.sara.putservice.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/service/v1/cars")
@ResponseBody
@Slf4j
public class CarController {
    @Autowired
    private CarService service;

    @PostMapping("/")
    Car postCar(@RequestBody Car newCar) {
        log.warn("Looking for car {}",newCar);
        Car car = service.putCar(newCar).orElseThrow(() -> {
            log.error("Car not created");
            return new ResponseStatusException(HttpStatus.NOT_FOUND, "Car not created");
        });
        log.info("Car created {}",car);
        return car;
    }

}
