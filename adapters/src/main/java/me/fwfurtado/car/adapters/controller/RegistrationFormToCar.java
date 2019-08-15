package me.fwfurtado.car.adapters.controller;

import me.fwfurtado.car.domain.Car;
import me.fwfurtado.car.domain.Car.Brand;

public class RegistrationFormToCar {

    Car convert(RegistrationForm form) {
        Brand brand = Brand.valueOf(form.getBrand());

        return new Car(brand, form.getModel(), form.getPlate());
    }
}
