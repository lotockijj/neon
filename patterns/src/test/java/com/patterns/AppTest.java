package com.patterns;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase{

    public AppTest( String testName ){
        super( testName );
    }

    public static Test suite(){
        return new TestSuite( AppTest.class );
    }

    public void testApp(){
        List<String> list = new ArrayList<>();
        list.add("Roman");
        list.add("Lotockiy");
        list.clear();
        Assert.assertTrue(list.isEmpty());
        list.add("Kolya");
        Assert.assertFalse(list.isEmpty());
        list.removeAll(list);
        Assert.assertTrue(list.isEmpty());
    }
}
