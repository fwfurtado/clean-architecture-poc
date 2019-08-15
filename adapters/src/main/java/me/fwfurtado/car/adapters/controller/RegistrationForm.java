package me.fwfurtado.car.adapters.controller;

import java.util.StringJoiner;

public class RegistrationForm {
    private String plate;
    private String brand;
    private String model;

    private RegistrationForm() {
    }

    public RegistrationForm(String plate, String brand, String model) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", RegistrationForm.class.getSimpleName() + "[", "]")
            .add("plate='" + plate + "'")
            .add("brand='" + brand + "'")
            .add("model='" + model + "'")
            .toString();
    }
}
