package com;

import java.io.File;
import java.util.Scanner;

public class DemoApp {

	public static void main(String[] args) throws Exception{
		File ff = new File("//home/migueljcaldeira/Desktop/MC_Phase1Project/FileFolder");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the filename:");
		String fileName = sc.next();
		String newPath = ff.getPath()+"//"+fileName;
		
		// To insert information inside the file being created
		//		FileOutputStream fos = new FileOutputStream(newPath);
		//		fos.write('A');
		//		System.out.println("Success...");
		
		// Create new file
//		ff = new File(newPath);
//		if (ff.exists()) {
//			System.out.println("File already exists");
//		} else {
//			ff.createNewFile();
//			System.out.println("File sucessufully created as < "+fileName +" >");
//		}
			
		// Delete file
//		ff = new File(newPath);
//		if (ff.exists()) {
//				ff.delete();
//				System.out.println("File successfully deleted");
//		} else {
//			
//			
//			System.out.println("File not present with name < "+fileName +" >");
//		}
		
		
		// Search file
				ff = new File(newPath);
				if (ff.exists()) {
					System.out.println("File exists < "+fileName +" >");
				} else {
					
					
					System.out.println("File not present with name < "+fileName +" >");
				}
		
		}
	}


