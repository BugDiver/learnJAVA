import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringFunctionTest{

  @Test
  public void countVowels() {
    StringFunction s = new StringFunction();
    assertEquals(s.countVowels("lalit"),2);
    assertEquals(s.countVowels("Lalita"),3);
    assertEquals(s.countVowels("LALAti"),3);
  }

}