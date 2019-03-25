package com.capgemini.main;

import java.io.File;

public class FileExist {

	public boolean  fileExistsOrNot()
	{
		 File file = new File("C:\\Users\\aayshukl\\Downloads\\collection-assignments\\src\\com\\capgemini\\client\\TreeSetDemo.java");
		 return file.exists();
	}
}
