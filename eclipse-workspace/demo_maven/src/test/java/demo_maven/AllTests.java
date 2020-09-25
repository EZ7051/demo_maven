package demo_maven;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalParametrized.class, CalTest.class, RestApiTest.class })
public class AllTests {

}
