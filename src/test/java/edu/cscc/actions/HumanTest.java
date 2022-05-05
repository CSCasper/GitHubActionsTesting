package edu.cscc.actions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class HumanTest {

	Human man;

	@BeforeEach
	void setUp(){
		man = new Human("Bob", 42);
	}

	@Test
	void getName() {
		assertEquals("Bob", man.getName());
	}

	@Test
	void setName() {
		man.setName("Geoff");
		assertEquals("Jeff", man.getName());
	}

	@Test
	void getAge() {
		assertEquals(42, man.getAge());
	}

	@Test
	void setAge() {
		man.setAge(30);
		assertEquals(30, man.getAge());
	}
}