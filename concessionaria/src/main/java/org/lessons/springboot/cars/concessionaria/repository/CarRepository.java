package org.lessons.springboot.cars.concessionaria.repository;

import org.lessons.springboot.cars.concessionaria.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {

}
