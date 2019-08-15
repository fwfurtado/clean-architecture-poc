package me.fwfurtado.car.spring.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String brand;

    @NotNull
    private String licensePlate;

    @NotNull
    private String model;

    /**
     * @deprecated used by hibernate
     */
    @Deprecated
    private CarEntity() {
    }

    public CarEntity(@NotNull String brand, @NotNull String licensePlate, String model) {
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}
