/**
 * 
 */
package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.junitpack.App;

/**
 * @author M8081335
 *
 */
public class AppTest {
	
	App app = new App();

	@Test
	public void test() {
		assertEquals("Hello world Welcome", app.greet("world"));
	}

	 @Test
	    public void testTrue()
	    {
	        assertTrue( true );
	    }
	/* @Test
		public void test1() {
			assertNotEquals("Hello world ", app.greet("world"));
		}
	 
	 @Test
	    public void test1False()
	    {
	        assertFalse( false );
	    }*/
}
