package web.model;

import java.util.ArrayList;
import java.util.List;


public class Car {
    private int id;
    private String name;
    private String color;

    public Car() {

    }

    public Car(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "car1", "black"));
        cars.add(new Car(2, "car2", "green"));
        cars.add(new Car(3, "car3", "white"));
        cars.add(new Car(4, "cars4", "red"));
        cars.add(new Car(5, "cars5", "yellow"));
        return cars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
