import org.junit.*;
import static org.junit.Assert.*;


public class FibIterativeTest {

    @Test
    public void testFibIterative(){

        System.out.println("----------------");
        System.out.println("Iterative Test");
        Fibonacci fi = new Fibonacci();


        assertEquals(1820529360, fi.fibIterative(60));

    }

}
