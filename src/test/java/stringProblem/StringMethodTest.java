package stringProblem;

import static org.junit.Assert.*;

//import org.junit.BeforeClass;
import org.junit.Test;

public class StringMethodTest {
	StringMethod sm = new StringMethod();
	
	@Test
	public void positiveTestLooping() {
		assertEquals("Assert that all instances of 'l' removed from 'Hello World!'", 
				"Heo Word!", sm.loopMethod("Hello World!", 'l'));
	}
	
	@Test
	public void positiveTestLooping2() {
		assertEquals("Assert that all instances of 'H' removed from 'Hello World!'", 
				"ello World!", sm.loopMethod("Hello World!", 'H') );
	}
	
	@Test
	public void positiveTestLooping3() {
		assertNotEquals("Assert that all instances of 'l' removed from 'Hello World!'", 
				"Hello World!", sm.loopMethod("Hello World!", 'l'));
	}
	
	@Test
	public void positiveTestLooping4() {
		assertNotEquals("Assert that all instances of 'l' removed from 'Hello World!'", 
				"Hello World!", sm.loopMethod("43536364", '4'));
	}
	
	@Test
	public void positiveTestLooping5() {
		assertNotEquals("Assert that all instances of 'l' removed from 'Hello World!'", 
				"Hello World!", sm.loopMethod("", '5'));
	}
	
	@Test
	public void positiveTestStringMethod() {
		assertEquals("Assert that all instances of 'l' removed from 'Hello World!'", 
				"Heo Word!", sm.stringFunction("Hello World!", 'l'));
	}
	
	@Test
	public void positiveTestStringMethod2() {
		assertEquals("Assert that all instances of 'H' removed from 'Hello World!'", 
				"ello World!", sm.stringFunction("Hello World!", 'H') );
	}
	
	@Test
	public void positiveTestStringMethod3() {
		assertNotEquals("Assert that all instances of 'H' removed from 'Hello World!'", 
				"Hello World!", sm.stringFunction("Hello World!", 'H') );
	}
}

