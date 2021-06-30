package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarService {
    List<Car> listCars = new ArrayList<>();
    List<Car> getCarsCount(int count);

    List<Car> getAllCars();
}
