import org.junit.*;
import static org.junit.Assert.*;


public class FibMemoTest {

    @Test
    public void testFib(){
        System.out.println("----------------");
        System.out.println("Memo Test");
        FibonacciMemoization fi = new FibonacciMemoization();

        assertEquals(1820529360, fi.fib(60));


    }


//java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore
//java -cp .:/Users/jakeholdom/Programming/Java/lib/junit-4.12.jar:/Users/jakeholdom/Programming/Java/lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore
//export CLASSPATH=/Users/jakeholdom/Programming/Java/lib/hamcrest-core-1.3.jar:/Users/jakeholdom/Programming/Java/lib/junit-4.12.jar:.
}
