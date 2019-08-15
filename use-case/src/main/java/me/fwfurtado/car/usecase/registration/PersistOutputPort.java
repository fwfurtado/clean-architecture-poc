package me.fwfurtado.car.usecase.registration;

import me.fwfurtado.car.domain.Car;

public interface PersistOutputPort {

    Long persist(Car car);
}
