package edu.mills.cs180;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeCheckerTest {

	@Test
	void isPalindrome_True_EmptyString() {
		assertTrue(PalindromeChecker.isPalindrome(""));
	}

}
