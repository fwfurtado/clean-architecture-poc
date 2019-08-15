package me.fwfurtado.car.adapters.gateway;

import me.fwfurtado.car.domain.Car;

public interface Persist {

    Long save(Car car);
}
