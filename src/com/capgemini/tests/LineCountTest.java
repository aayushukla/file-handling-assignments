package com.capgemini.tests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.main.LineCount;

public class LineCountTest {

	@Test
	public void testForNumberOfLines() throws IOException {
		assertEquals(10, new LineCount().lineCount());
	}

}
