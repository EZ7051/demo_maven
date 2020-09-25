package demo_maven;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.demo.RestApi;

public class RestApiTest {
	private RestApi api;

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		api = new RestApi();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(timeout = 300)
	public void test() {
		assertEquals("hello", api.getData());
	}
}
