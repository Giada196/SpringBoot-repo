package com.example.crudexample.Controllers;

import com.example.crudexample.entities.Car;
import com.example.crudexample.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarControllers {
    @Autowired
    CarRepository carRepository;

    @PostMapping
    public Car create(@RequestBody Car car) {
        Car carSaved = carRepository.saveAndFlush(car);
        return carSaved;
    }

    @GetMapping("/{id}")
    public Car findCarById(@PathVariable Long id) {
        Car car = new Car();
        if (carRepository.existsById(id)) {
            car = carRepository.getById(id);
            return car;
        } else {
            return car;
        }
    }
    @GetMapping
    public List<Car> findAll() {
        List<Car> cars = carRepository.findAll();
        return cars;
    }
    @PutMapping("/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable long id, @RequestBody Car car) {
        if (carRepository.existsById(id)) {
            Car updatedCar = carRepository.saveAndFlush(car);
            return ResponseEntity.ok(updatedCar);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCarById(@PathVariable Long id) {
        if (carRepository.existsById(id)) {
            carRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllCars() {
        carRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }
}









