import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;
import java.util.*;

public class ArrayFunctionTest{
	ArrayFunction lib;

	@Before
	public void setUp(){
		lib = new ArrayFunction();
	}

	@Test
	public void selectOdd() {
		int[] list = {1,2,3,4,5,6,7,8,9,};
		int[] excepted = {1,3,5,7,9};

		assertTrue(Arrays.equals(lib.selectOdd(list),excepted));
	}
}