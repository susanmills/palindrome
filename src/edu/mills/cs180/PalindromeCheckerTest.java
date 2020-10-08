package edu.mills.cs180;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeCheckerTest {

	@Test
	void isPalindrome_True_EmptyString() {
		assertTrue(PalindromeChecker.isPalindrome(""));
	}

	@ParameterizedTest
	@ValueSource(strings = {"AMA", "racecar", "x"})
	void isPalindrome_True_SingleWordPalindrome(String s) {
		assertTrue(PalindromeChecker.isPalindrome(s));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Java", "abc", "spatula"})
	void isPalindrome_False_SingleWordNonpalindrome(String s) {
		assertFalse(PalindromeChecker.isPalindrome(s));
	}
}
