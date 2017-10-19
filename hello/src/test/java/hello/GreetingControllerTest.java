package hello;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class GreetingControllerTest extends TestCase{


    public GreetingControllerTest( String testName ){
        super( testName );
    }

    public static Test suite(){
        return new TestSuite( GreetingControllerTest.class );
    }

    public void testApp(){
        assertTrue( true );
    }
}
