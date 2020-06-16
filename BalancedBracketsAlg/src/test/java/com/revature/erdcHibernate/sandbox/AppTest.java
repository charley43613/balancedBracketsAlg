package com.revature.erdcHibernate.sandbox;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
	String a;
	String b;
	String c;
	String d;
	String e;
	
	@BeforeClass
	public static void doBeforeTests() {
		
	}
	

	@Before
	public void doBeforeStuff() {
		a = "{(33[{{{[hello]334}}])}";
		b = "{{]]";
		c = "{8dfdskfsdf}{sdfksdkj[ksdfk]}";
		d = "(askdk(sdkkk(k)))";
		e = "{[kdkk]}(dkkk)";
		
	}
	
	
	

	@AfterClass
	public static void dontDoShitAfterTests() {
		
	}

	
	@Test
	public void test1(){
		assertEquals("{(33[{{{[hello]334}}])}", false, App.isValid(a));
	}
	
	@Test
	public void test2(){
		assertEquals("{{]]", false, App.isValid(b));
	}
	@Test
	public void test3(){
		assertEquals("{8dfdskfsdf}{sdfksdkj[ksdfk]}", true, App.isValid(c));
	}
	@Test
	public void test4(){
		assertEquals("(askdk(sdkkk(k)))", true, App.isValid(d));
	}
	@Test
	public void test5(){
		assertEquals("{[kdkk]}(dkkk)", true, App.isValid(e));
	}
	
	

}
