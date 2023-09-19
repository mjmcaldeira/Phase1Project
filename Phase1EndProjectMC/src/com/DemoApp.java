package com;

import java.io.File;
import java.io.FileOutputStream;

public class DemoApp {

	public static void main(String[] args) throws Exception{
		File ff = new File("//home/migueljcaldeira/Desktop/MC_Phase1Project/FileFolder");
//		System.out.println(ff.getPath());
//		System.out.println(ff.isDirectory());
//		String allFiles [] = ff.list();
//		for (String name:allFiles) {
//			 System.out.println(name);
//		}
		String fileName = "Barbara.txt";
		String newPath = ff.getPath()+"//"+fileName;
//		FileOutputStream fos = new FileOutputStream(newPath);
//		fos.write('A');
//		fos.close();
//		System.out.println("Success...");
		ff = new File(newPath);
		ff.createNewFile();
		
	}

}
