import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {
	
	@Test
	public void testing_attr_make() {
		Car obj = new Car();
		try {
			obj.make = "Ford";
			assertEquals(true, false);
		} catch(Exception e) {
			obj.set_make("Ford");
			assertEquals("Ford", obj.get_make());
		}
	}

	@Test
	public void testing_attr_model() {
		Car obj = new Car();
		try {
			obj.model = "Mustang";
			assertEquals(true, false);
		} catch(Exception e) {
			obj.set_model("Mustang");
			assertEquals("Mustang", obj.get_model());
		}
	}

	@Test
	public void testing_attr_year() {
		Car obj = new Car();
		try {
			obj.year = 2000;
			assertEquals(true, false);
		} catch(Exception e) {
			obj.set_year(2000);
			assertEquals(2000, obj.get_year());
		}
	}

	@Test
	public void testing_attr_year_1800() {
		Car obj = new Car();
		obj.set_year(2000);
		obj.set_year(1800);
		assertEquals(2000, obj.get_year());
	}

}
