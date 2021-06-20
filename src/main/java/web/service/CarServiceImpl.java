package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    Car car = new Car();

    @Override
    public List<Car> getCarsCount(int count) {
        List<Car> carList = car.getCars();
        return carList.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> getAllCars() {
        return car.getCars();
    }
}