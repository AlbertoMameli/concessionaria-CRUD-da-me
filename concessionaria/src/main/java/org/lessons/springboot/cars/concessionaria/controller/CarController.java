package org.lessons.springboot.cars.concessionaria.controller;


import java.util.List;

import org.lessons.springboot.cars.concessionaria.model.Car;
import org.lessons.springboot.cars.concessionaria.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//sei un controller che va a rispondere alle 
@RequestMapping("/cars")//richieste che partono nell'url
public class CarController{
    @Autowired
    private CarRepository carRepository;


    @GetMapping//serve per restituirmi la ricerca
    public String index(Model model){//prendo il moel di spring!
        List<Car> cars = carRepository.findAll();//lista dei giochi che mi permette di dialogare con il db
        model.addAttribute("cars", cars);

        return "cars/index";
    }

    @GetMapping("/{id}")
    public String show (@PathVariable(name ="id")Integer id,Model model){

        model.addAttribute("car",carRepository.findById(id).get());
        return"cars/show";
    }
}