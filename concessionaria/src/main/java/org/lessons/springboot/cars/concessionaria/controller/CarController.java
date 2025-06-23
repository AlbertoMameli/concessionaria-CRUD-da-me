package org.lessons.springboot.cars.concessionaria.controller;


import java.util.List;

import org.lessons.springboot.cars.concessionaria.model.Car;
import org.lessons.springboot.cars.concessionaria.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cars")
public class CarController{
    @Autowired
    private CarRepository carRepository;


    @GetMapping
    public String index(Model model){
        List<Car> cars = carRepository.findAll();
        model.addAttribute("cars", cars);

        return "cars/index";
    }
}