import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;

public class StringFunctionTest{
	StringFunction lib;

	@Before
	public void setUp(){
		lib = new StringFunction();
	}

	@Test
	public void countVowels() {
		assertEquals(lib.countVowels("lalit"),2);
		assertEquals(lib.countVowels("Lalita"),3);
		assertEquals(lib.countVowels("LALAti"),3);
	}

	@Test
	public void countConsonants() {
		assertEquals(lib.countConsonants("lalit"),3);
		assertEquals(lib.countConsonants("Lal  123iTA"),3);
		assertEquals(lib.countConsonants("LAL123#$%^Ati"),3);
	}

	@Test
	public void isPalindrome() {
		assertTrue(lib.isPalindrome("oho"));
		assertTrue(lib.isPalindrome("malayalam"));
		assertTrue(lib.isPalindrome("mom"));
	}
	@Test
	public void strip() {
		assertTrue(lib.strip("hello world  !!!").equals("helloworld!!!"));
		assertEquals(lib.strip("spaces should be removed"),"spacesshouldberemoved");
	}
}