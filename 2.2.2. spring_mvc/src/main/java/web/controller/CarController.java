package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(name = "count", required = false, defaultValue = "5") int count,
                            ModelMap model) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car(1, "Lightning", "McQueen"));
        cars.add(new Car(2, "Tow", "Mater"));
        cars.add(new Car(3, "Hornet", "Hudson"));
        cars.add(new Car(4, "Sally", "Carrera"));
        cars.add(new Car(5, "Francesco", "Bernoulli"));

        model.addAttribute("cars", carService.listCars(cars, count));

        return "cars";
    }
}
