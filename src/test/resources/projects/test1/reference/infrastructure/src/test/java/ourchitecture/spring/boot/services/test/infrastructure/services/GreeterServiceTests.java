package ourchitecture.spring.boot.services.test.infrastructure.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ourchitecture.spring.boot.services.test.domain.models.Person;

public class GreeterServiceTests {
	
	@Test
	public void extendGreeting() {
		
		final GreeterService greeter = new GreeterService();
		final Person person = new Person();
		
		person.setFirstName("unit");
		person.setLastName("test");
		
		assertEquals("Hello unit test", greeter.greet(person));
	}
}
