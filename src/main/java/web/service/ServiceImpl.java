package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceImpl implements Service {
    List<Car> listCar = new ArrayList<>();
    public ServiceImpl() {
    listCar.add(new Car(1, "ГАЗ-66", 700000));
    listCar.add(new Car(2, "УАЗ-469", 525000));
    listCar.add(new Car(3, "ГАЗ-66", 700000));
    listCar.add(new Car(4, "Камаз-5350", 12500000));
    listCar.add(new Car(5, "Камаз-5350", 17000000));
    }

    public List<Car> getListCar(int amount) {
        List<Car> listCars = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            listCars.add(listCar.get(i));
        }
        return listCars;
    }

    @Override
    public List<Car> getCars(int amount) {
        List<Car> ListCar = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            ListCar.add(listCar.get(i));
        }
        return ListCar;
    }


}
