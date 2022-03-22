package org.sara.putservice.service;

import lombok.extern.slf4j.Slf4j;
import org.sara.putservice.entities.Car;
import org.sara.putservice.repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class CarService {
    private final CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public Optional<Car> putCar(Car car) {
        return Optional.of(repository.save(car));
    }
}
