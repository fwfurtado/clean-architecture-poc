package me.fwfurtado.car.domain;

public class Car {

    private Brand brand;
    private String model;
    private String licensePlate;

    public enum Brand {
        AUDI,
        BMW,
        CHEVROLET,
        MERCEDES_BENZ
    }

    public Car(Brand brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}
