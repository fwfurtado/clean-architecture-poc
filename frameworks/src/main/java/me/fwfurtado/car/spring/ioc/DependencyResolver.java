package me.fwfurtado.car.spring.ioc;

import me.fwfurtado.car.adapters.controller.RegistrationController;
import me.fwfurtado.car.adapters.controller.RegistrationFormToCar;
import me.fwfurtado.car.adapters.gateway.Persist;
import me.fwfurtado.car.adapters.gateway.PersistenceGateway;
import me.fwfurtado.car.usecase.registration.PersistOutputPort;
import me.fwfurtado.car.usecase.registration.RegistrationInputPort;
import me.fwfurtado.car.usecase.registration.RegistrationInteractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class DependencyResolver {

    @Bean
    PersistOutputPort persistOutputPort(Persist persist) {
        return new PersistenceGateway(persist);
    }

    @Bean
    RegistrationInputPort registrationInputPort(PersistOutputPort outputPort) {
        return new RegistrationInteractor(outputPort);
    }

    @Bean
    RegistrationController registrationController(RegistrationInputPort inputPort) {
        return new RegistrationController(inputPort, new RegistrationFormToCar());
    }
}
