package com.capgemini.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.main.FileExist;

public class FileExistTest {

	@Test
	public void testForFileExistance() {
		FileExist obj=new FileExist();
		assertEquals(true, obj.fileExistsOrNot());
	}

}
