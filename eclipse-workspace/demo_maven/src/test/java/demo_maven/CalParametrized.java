package demo_maven;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.demo.Cal;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class CalParametrized {
private int expectedResult;
private int firstNumber;
private int secondNumber;

 @Parameters
public static Collection<Object[]> testData() {
System.out.println("@Parameters is called..");
Object[][] data = new Object[][] { { 4, 2,3 }, { 4, 1, 3 }, { 6, 3, 3 } };
return Arrays.asList(data);
}

 Cal calculator;
@Before
public void setUp() throws Exception {
System.out.println("setup is called...");
calculator = new Cal();
}
// 4 2 2
// 4 1 3
public CalParametrized(int expectedResult, int firstNumber, int secondNumber) {
System.out.println("hello ctr. ");
this.expectedResult = expectedResult;
this.firstNumber = firstNumber;
this.secondNumber = secondNumber;
}

 @Test
public void testAdd() {
Assert.assertEquals(expectedResult, calculator.add(firstNumber, secondNumber));
}

 @After
public void tearDown() throws Exception {
calculator = null;
}
}