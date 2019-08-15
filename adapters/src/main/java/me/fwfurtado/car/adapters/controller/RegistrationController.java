package me.fwfurtado.car.adapters.controller;

import me.fwfurtado.car.usecase.registration.RegistrationInputPort;
import me.fwfurtado.car.domain.Car;

public class RegistrationController {

    private final RegistrationInputPort registrationInputPort;
    private final RegistrationFormToCar converter;

    public RegistrationController(RegistrationInputPort registrationInputPort, RegistrationFormToCar converter) {
        this.registrationInputPort = registrationInputPort;
        this.converter = converter;
    }

    public Long register(RegistrationForm form) {

        Car car = converter.convert(form);

        Long id = registrationInputPort.register(car);

        return id;
    }
}
