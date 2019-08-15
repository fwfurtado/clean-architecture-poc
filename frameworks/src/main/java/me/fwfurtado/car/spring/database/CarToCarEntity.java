package me.fwfurtado.car.spring.database;

import me.fwfurtado.car.domain.Car;
import org.springframework.stereotype.Component;

@Component
class CarToCarEntity {

    CarEntity convert(Car car) {
        return new CarEntity(car.getBrand().name(), car.getLicensePlate(), car.getModel());
    }
}
