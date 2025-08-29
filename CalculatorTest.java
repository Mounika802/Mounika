import org.junit.Test;
import Static org.Junit.Assert.assertEquals;
public class CalculatorTest{
Calculator calc=new calculator();
@Test public void testAddition(){assertEquals (15,calc.add(10,5));}
@Test public void testSubstraction(){assertEquals (5,calc.substract(10,5));}
@Test public void testMultiplication(){assertEquals (50,calc.multiply(10,5));}
@Test public void testDivision(){assertEquals (2,calc.divide(10,5));}
}