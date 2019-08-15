package me.fwfurtado.car.adapters.gateway;

import me.fwfurtado.car.usecase.registration.PersistOutputPort;
import me.fwfurtado.car.domain.Car;

public class PersistenceGateway implements PersistOutputPort {

    private final Persist persist;

    public PersistenceGateway(Persist persist) {
        this.persist = persist;
    }

    @Override
    public Long persist(Car car) {
        return persist.save(car);
    }
}
