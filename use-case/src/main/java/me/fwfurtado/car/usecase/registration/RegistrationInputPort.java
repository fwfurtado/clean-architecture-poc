package me.fwfurtado.car.usecase.registration;

import me.fwfurtado.car.domain.Car;

public interface RegistrationInputPort {

    Long register(Car car);
}
