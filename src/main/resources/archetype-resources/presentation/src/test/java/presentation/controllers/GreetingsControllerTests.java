package ${package}.presentation.controllers;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import ${package}.domain.services.Greeter;

public class GreetingsControllerTests {
	
	@Test
	public void sayHello() {
		
		final Greeter mockGreeter = mock(Greeter.class);
		final GreetingsController greetingsController = new GreetingsController(mockGreeter);
		
		final String expectedResponse = "mock you";
		
		when(mockGreeter.greet(any())).thenReturn(expectedResponse);
		
		assertEquals(expectedResponse, greetingsController.hello("unit", "test"));
		
		verify(mockGreeter).greet(any());
	}
}
