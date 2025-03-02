package in.pwskills.nitin.main;

import junit.framework.TestCase;

/**
 * Unit test for Arithmetic class.
 */
public class AppTest extends TestCase
{
	public void testSumWithPositiveNumber()
    {
        Arithmetic ar = new Arithmetic();
		int actual = ar.add(10,20);
		int expected = 30;

		//checking for testcase
		assertEquals(actual,expected);//PASS
    }

	/*
	public void testSumWithNegativeNumber()
    {
        Arithmetic ar = new Arithmetic();
		int actual = ar.add(-10,-20);
		int expected = -31;

		//checking for testcase
		assertEquals(actual,expected);//FAIL
    }
	*/

    public void testSumWithMixedNumber()
    {
        Arithmetic ar = new Arithmetic();
		int actual = ar.add(-10,20);
		int expected = 10;

		//checking for testcase
		assertEquals(actual,expected);//PASS
    }

    public void testSumWithZero()
	{
        Arithmetic ar = new Arithmetic();
		int actual = ar.add(0,0);
		int expected = 0;

		//checking for testcase
		assertEquals(actual,expected);//PASS
    }
  
}
