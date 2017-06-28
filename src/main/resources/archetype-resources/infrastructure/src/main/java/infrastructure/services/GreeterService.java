package ${package}.infrastructure.services;

import org.springframework.stereotype.Service;

import ${package}.domain.services.Greeter;
import ${package}.domain.models.Person;

@Service
public class GreeterService implements Greeter {
    
    public String greet(final Person person) {
        return "Hello " + person.getFirstName() + " " + person.getLastName();
    }
}
