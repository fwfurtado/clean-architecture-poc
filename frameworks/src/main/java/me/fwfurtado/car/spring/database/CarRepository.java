package me.fwfurtado.car.spring.database;

import org.springframework.data.repository.Repository;

public interface CarRepository extends Repository<CarEntity, Long> {

    void save(CarEntity entity);
}
