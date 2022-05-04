import static org.junit.jupiter.api.Assertions.*;

import edu.cscc.actions.Human;
import org.junit.jupiter.api.*;

import java.util.Date;

class HumanTest {

	Human man;

	@BeforeEach
	void setUp(){
		man = new Human("Bob", 42);
	}

	@org.junit.jupiter.api.Test
	void getName() {
		assertEquals("Bob", man.getName());
	}

	@org.junit.jupiter.api.Test
	void setName() {
		man.setName("Jeff");
		assertEquals("Jeff", man.getName());
	}

	@org.junit.jupiter.api.Test
	void getAge() {
		assertEquals(42, man.getAge());
	}

	@org.junit.jupiter.api.Test
	void setAge() {
		assertEquals(30, man.getAge());
	}
}