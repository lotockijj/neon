package com.patterns.bridge;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileData implements Data {

	public boolean writeData(String str) {
		boolean result = false;
		File file = new File("result.txt");
		try(FileWriter fr = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fr)){
			bw.write(str);
			result = true;
		} catch (IOException e){
			e.printStackTrace();
		}
		return result;
	}

}
