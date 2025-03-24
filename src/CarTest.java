import static org.junit.Assert.*;

import org.junit.Test;

import dealership.Car;

public class CarTest {
	
	@Test
	public void testing_attr_make() {
		Car obj = new Car();
		obj.set_make("Ford");
		obj.set_make("");
		assertEquals("Ford", obj.get_make());
	}

	@Test
	public void testing_attr_model() {
		Car obj = new Car();
		obj.set_model("Mustang");
		obj.set_model("");
		assertEquals("Mustang", obj.get_model());
	}

	@Test
	public void testing_attr_year() {
		Car obj = new Car();
		obj.set_year(2000);
		obj.set_year(1800);
		assertEquals(2000, obj.get_year());
	}

}
