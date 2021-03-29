package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao{
    private List<Car> cars = new ArrayList<>(); {
        cars.add(new Car(1, "Lightning", "McQueen"));
        cars.add(new Car(2, "Tow", "Mater"));
        cars.add(new Car(3, "Hornet", "Hudson"));
        cars.add(new Car(4, "Sally", "Carrera"));
        cars.add(new Car(5, "Francesco", "Bernoulli"));
    }




    @Override
    public List<Car> listCars(int count) {
        return cars.subList(0, (count >= 5) ? cars.size() : count);

    }
}
