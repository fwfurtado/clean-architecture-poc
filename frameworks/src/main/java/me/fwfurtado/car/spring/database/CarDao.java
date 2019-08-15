package me.fwfurtado.car.spring.database;

import me.fwfurtado.car.adapters.gateway.Persist;
import me.fwfurtado.car.domain.Car;
import org.springframework.stereotype.Repository;

@Repository
class CarDao implements Persist {

    private final CarRepository repository;
    private final CarToCarEntity converter;

    public CarDao(CarRepository repository, CarToCarEntity converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public Long save(Car car) {
        CarEntity entity = converter.convert(car);

        repository.save(entity);

        return entity.getId();
    }
}
