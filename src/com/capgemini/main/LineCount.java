package com.capgemini.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {

	public int lineCount() throws IOException
	{
		BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
		int lines = 0;
		while (reader.readLine() != null) lines++;
		reader.close();
		return lines;	
	}
}
