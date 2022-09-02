package de.cbw.oca.playground;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NextDiceCupTest {

	@Test
	void check_valid_values() {
		
		assertAll("mehrere rolls",
			() -> {
				int actual = NextDiceCup.roll();
				assertTrue(1 <= actual && 6 >= actual, "Range " + actual);
				},
			() -> {
				int actual = NextDiceCup.roll();
				assertTrue(1 <= actual && 6 >= actual, "Range " + actual);
			},
			() -> {
				int actual = NextDiceCup.roll();
				assertTrue(1 <= actual && 6 >= actual, "Range " + actual);
			},
			() -> {
				int actual = NextDiceCup.roll();
				assertTrue(1 <= actual && 6 >= actual, "Range " + actual);
			},
			() -> {
				int actual = NextDiceCup.roll();
				assertTrue(1 <= actual && 6 >= actual, "Range " + actual);
			}
		);
	}
	
	@Test
	void check_array_count() {
		int expected = 10;
		int[] arr = NextDiceCup.roll(10);
		assertEquals(expected, arr.length);
	}
}
