import org.junit.*;
import static org.junit.Assert.*;


public class FibRecursiveTest {

    public Fibonacci fi;

    @Before
    public void setUp(){

        System.out.println("----------------");
        System.out.println("Recursive Test");
        //
        Fibonacci fi = new Fibonacci();
    }

    @Test
    public void testRecursive(){



        assertEquals(1820529360, fi.fib(60));

    }

}
