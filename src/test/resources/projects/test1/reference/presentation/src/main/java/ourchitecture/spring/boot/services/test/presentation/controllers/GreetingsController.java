package ourchitecture.spring.boot.services.test.presentation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import ourchitecture.spring.boot.services.test.domain.models.Person;
import ourchitecture.spring.boot.services.test.domain.services.Greeter;

@RestController
public class GreetingsController {

    private Greeter greeter;

    public GreetingsController(final Greeter greeter) {
        this.greeter = greeter;
    }

    @GetMapping("/hello/{firstName}/{lastName}")
    public String hello(@PathVariable final String firstName, @PathVariable final String lastName) {
        final Person person = new Person();
        
        person.setFirstName(firstName);
        person.setLastName(lastName);
        
        return this.greeter.greet(person);
    }
}
