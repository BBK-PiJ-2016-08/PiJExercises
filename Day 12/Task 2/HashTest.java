import org.junit.*;
import static org.junit.Assert.*;

public class HashTest {

  @Test
  public void testHashResult() {
    HashUtilities h = new HashUtilities();

    for (int i = 0;i <= 2000; i++){
      int output = h.shortHash(i);
      int expected = Math.abs(i % 1000);
      assertEquals(output, expected);

    }

  }
}
