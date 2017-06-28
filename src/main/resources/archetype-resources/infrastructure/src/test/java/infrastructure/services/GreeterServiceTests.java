package ${package}.infrastructure.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ${package}.domain.models.Person;

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
