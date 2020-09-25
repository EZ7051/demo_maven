package demo_maven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.demo.Cal;

//public class CalTest {
//
//	private Cal cal;
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
//
//	
//	@Test
//	public void test() {
//		int sum = cal.add(2, 1);
//		assertEquals(3,sum);
//		System.out.println("test case 1");
//		
//	}
//
//}

public class CalTest {
	//run only once before running the class eg-driver code
	//start sessionfactory
	private Cal cal;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.out.println("this is going to run only once at beginning");
	}
	//close sessionfactory
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	System.out.println("this is going to run at the end");
	}

	 @Before
	public void setUp() throws Exception {
	cal=new Cal();
	System.out.println("run before each test case");
	}

	 @After
	public void tearDown() throws Exception {
	cal=null;
	System.out.println("run ater each test case");
	}
	//@Ignore
	@Test
	public void testAdd() {
	int sum=cal.add(2, 2);
	assertEquals(4, sum);
	System.out.println("test case1");
	}
	@Test(expected=ArithmeticException.class)
	public void testDivide() {
	int div=cal.divide(4, 0);
	assertEquals(2, div);
	System.out.println("test case1");
	}

	}
