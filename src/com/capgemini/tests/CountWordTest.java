package com.capgemini.tests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.main.CountWords;

public class CountWordTest {

	@Test
	public void testTheNumeberofWord() throws IOException {
		CountWords wordCount = new CountWords("C:\\My_Workspaces\\test.txt");
		assertEquals(7, wordCount.wordCount());
	}

}
