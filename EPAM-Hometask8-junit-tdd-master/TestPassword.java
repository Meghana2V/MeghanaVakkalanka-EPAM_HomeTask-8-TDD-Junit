package EPAMHometask.junittdd;
import org.testng.Assert.*;
import org.testng.annotations.*;

import junit.framework.Assert;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TestPassword {
	
	/* TODO list for my feature
	 * 1. "ABCDE" => "BCDE" => success
	 * 2. "AABBCD => "BCD => success
	 * 3. "BAACD" => "BCD" => success
	 * 4. "BBCAA" => "BBAA" => success
	 * 5. "AABCAA"=> "BAA" => success*/
	
	
	@Test
	public void TestPasswordLength()
	{
		PaswordValidator pv = new PaswordValidator();
		Assert.assertNotSame(true,pv.isValid("ABCDE"));
	}
	public void TestPasswordLength1()
	{
		PaswordValidator pv = new PaswordValidator();
		Assert.assertEquals(true,pv.isValid("AABBCD"));
	}
	public void TestPasswordLength2()
	{
		PaswordValidator pv = new PaswordValidator();
		Assert.assertEquals(true,pv.isValid("BAACD"));
	}
	public void TestPasswordLength3()
	{
		PaswordValidator pv = new PaswordValidator();
		Assert.assertEquals(true,pv.isValid("BBCAA"));
	}
	public void TestPasswordLength4()
	{
		PaswordValidator pv = new PaswordValidator();
		Assert.assertEquals(true,pv.isValid("AABCAA"));
	}
	
}
