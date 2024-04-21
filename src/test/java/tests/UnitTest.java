package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class UnitTest {
	public String getAnItemInAnArrayByIndex(final String[] givenArr, int index) {
		if(index < 0)
			throw new IllegalArgumentException("Index must greater than 0 - Actual index: " +index);
		return givenArr[index];
	}
	
	@Test
	public void unitTest() {
		String[] arr =  {"J", "A", "V", "A", " ", "O", "O", "P"};
		String result = getAnItemInAnArrayByIndex(arr, 0);
		// Valid input
		assertEquals("J", result);
		// Invalid input
		 IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
		        getAnItemInAnArrayByIndex(arr, -1);
		    });
		assertEquals("Index must greater than 0 - Actual index: -1", exception.getMessage().toString());
	}
}
