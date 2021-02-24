/*
Name: Ricky Small
Email: g00352166@gmit.ie
Purpose: Generate a counter app // Junit Lab Example
 */

package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterTest {

	private Counter myCounter;
	@Test
	void TestConstructor()
	{
		myCounter = new Counter();
		assertEquals(0, myCounter.getCount());
	}

}
