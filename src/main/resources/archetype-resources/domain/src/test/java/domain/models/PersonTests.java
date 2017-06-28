package ${package}.domain.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTests {
	
	@Test
	public void setAndGetFirstName() {
		
		final String value = "unit";
		final Person person = new Person();
		
		person.setFirstName(value);
		
		assertEquals(value, person.getFirstName());
	}
	
	@Test
	public void setAndGetLastName() {
		
		final String value = "test";
		final Person person = new Person();
		
		person.setLastName(value);
		
		assertEquals(value, person.getLastName());
	}
}
