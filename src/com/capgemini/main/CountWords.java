package com.capgemini.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
	private String path;
	private int count =0;
	private String lineCount;
	BufferedReader bufferedReader;
	FileReader fileReader;
	

	public CountWords() {
		super();

	}

	public CountWords(String path) throws FileNotFoundException{
		this.path=path;
	}

	public int wordCount() throws IOException{
		fileReader = new FileReader(path);
		bufferedReader = new BufferedReader(fileReader);
		
		while((lineCount= bufferedReader.readLine())!= null) {
			if(!(lineCount.equals(""))) {
				String[] wordList = lineCount.split("[ ]+");
				count +=wordList.length;
				
			}
		}
		bufferedReader.close();
		fileReader.close();
		return count;
	}

}
