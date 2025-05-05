package firsttesting;

import org.testng.annotations.Test;

public class First {

	
	@Test
	void setUp() {
		System.out.println("123 Testing");
	}
	
	
	@Test
	void tearDown() {
		System.out.println("tearDown");
	}
	
	@Test
	void bumbulakdi() {
		System.out.println("bumbulakdi");
	}
	
}
