package com.geeks.ds.stack.design;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;

public class FileRead {
	public static void main(String[] args) throws Exception {
		 File file = new File("C:\\Users\\madhurendra.raj\\Desktop\\test.txt");
         String st; 
         BufferedReader br = new BufferedReader(new FileReader(file)); 
         int count = 0;
         while ((st = br.readLine()) != null) {
        	 count++;
         }
         System.out.println(count);
    }

}
