package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarDaoImpl implements CarDao{

    @Override
    public List<Car> listCars(List cars, int count) {
        return cars.subList(0, (count >= 5) ? cars.size() : count);

    }
}
