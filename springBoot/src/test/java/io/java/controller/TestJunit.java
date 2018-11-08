
package io.java.controller;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import java.io.Console;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

//@RunWith(SpringRunner.class)
//@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)//by Default it follows ascending order of  HashCode of methods
public class TestJunit {
	
	ItemsCatelogController testItemsCatelogController = new ItemsCatelogController();
	 @BeforeClass
	public static void setup() {
		 System.out.println("Before class");	 
	    }
	@Before
	public void BeforeAllMethods() {
		System.out.println("Before  method");
	}
	@After
	public void afterAllMethods() {
		System.out.println("After method");
	}
	@Test
	public void testHello() {
		String result = testItemsCatelogController.hello();
		 assertEquals(result, "Hello Maha");
	}
	@Test
	public void testArrayEquals() {
		String strArr[] = {"Mahi","Sneha","Pravee"};
		String result[] = testItemsCatelogController.testArrayEquals();
		assertArrayEquals(result, strArr);
	}
	@Test
	public void testAssertFalse() {
		
		assertTrue(new ArrayList<Integer>().isEmpty());
	}
	@AfterClass
    public static void tear() {
		 System.out.println("After class");	 

    }
	 @Test
    public void testOnDev()
     {
         System.setProperty("ENV", "DEV");
         assumeTrue("DEV".equals(System.getProperty("ENV")));
     }
	// @Ignore
	 @Test
	 public void testIgnore()
     {
		 System.out.println("Ignore this");
     }
}
