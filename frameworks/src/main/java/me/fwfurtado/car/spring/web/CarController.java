package me.fwfurtado.car.spring.web;

import static org.springframework.http.ResponseEntity.created;

import java.net.URI;
import javax.validation.Valid;
import me.fwfurtado.car.adapters.controller.RegistrationController;
import me.fwfurtado.car.adapters.controller.RegistrationForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("cars")
class CarController {

    private static final Logger LOG = LoggerFactory.getLogger(CarController.class);

    private final RegistrationController registration;

    CarController(RegistrationController registration) {
        this.registration = registration;
    }

    @PostMapping
    ResponseEntity<?> createBy(@Valid @RequestBody RegistrationForm form, UriComponentsBuilder uriBuilder) {

        LOG.info("Receive a request to register a new car with this information '{}'", form);

        Long id = registration.register(form);

        URI uri = uriBuilder.path("cars/{id}").build(id);

        return created(uri).build();
    }

}
