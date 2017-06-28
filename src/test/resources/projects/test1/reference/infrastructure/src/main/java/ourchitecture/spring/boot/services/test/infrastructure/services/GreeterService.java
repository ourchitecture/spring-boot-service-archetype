package ourchitecture.spring.boot.services.test.infrastructure.services;

import org.springframework.stereotype.Service;

import ourchitecture.spring.boot.services.test.domain.services.Greeter;
import ourchitecture.spring.boot.services.test.domain.models.Person;

@Service
public class GreeterService implements Greeter {
    
    public String greet(final Person person) {
        return "Hello " + person.getFirstName() + " " + person.getLastName();
    }
}
