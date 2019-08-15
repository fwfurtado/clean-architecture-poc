package me.fwfurtado.car.usecase.registration;

import me.fwfurtado.car.domain.Car;

public class RegistrationInteractor implements RegistrationInputPort {

    private final PersistOutputPort persistOutputPort;

    public RegistrationInteractor(PersistOutputPort persistOutputPort) {
        this.persistOutputPort = persistOutputPort;
    }

    @Override
    public Long register(Car car) {
        return persistOutputPort.persist(car);
    }
}
