package com.selflearning.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateNewFile {

	public static void main(String[] args) {
		
		NewUser.CreateNewFileUsingFileOutputStream("firstUser.txt");
	}
		
}

class NewUser{
	public static void CreateNewFile(String filename) {
		File file = new File(filename);
		
		try {
			if(file.createNewFile()) {
				System.out.println("File created successfully!");
			}else {
				System.out.println("failed!");
			}
			
			// write content to file
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Have a good one!");
			fileWriter.close();
			
		} catch (IOException e) {
			System.out.println("file creation failed!");
		}
	}
	
	public static void CreateNewFileUsingFileOutputStream(String filename) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("::Enter Username: ");
		String uname = input.next();
		
		System.out.println("::Enter Password: ");
		String passwrd = input.next();
		
		
		try {
					
			FileOutputStream fileOutputStream = new FileOutputStream(filename);
			fileOutputStream.write(uname.getBytes());
			fileOutputStream.write(passwrd.getBytes());
		} catch (FileNotFoundException e) {
			System.out.println("file creation failed!");
		} catch (IOException e) {
			System.out.println("file operation failed!");
		}
		
	}
	
}
