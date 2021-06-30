package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    public CarServiceImpl() {
        listCars.add(new Car(1, "car1", "black"));
        listCars.add(new Car(2, "car2", "green"));
        listCars.add(new Car(3, "car3", "white"));
        listCars.add(new Car(4, "cars4", "red"));
        listCars.add(new Car(5, "cars5", "yellow"));
    }

    @Override
    public List<Car> getCarsCount(int count) {
        return listCars.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> getAllCars() {
        return listCars;
    }
}
