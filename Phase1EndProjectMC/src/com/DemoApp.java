package com;

import java.io.File;

public class DemoApp {

	public static void main(String[] args) throws Exception{
		File ff = new File("/home/migueljcaldeira/Desktop/MC_Phase1Project/Files");
//		System.out.println(ff.getPath());
//		System.out.println(ff.isDirectory());
//		String allFiles [] = ff.list();
//		for (String name:allFiles) {
//			 System.out.println(name);
//		}
		String filename = "Mike.txt";
		ff = new File(ff.getPath()+filename);
		ff.createNewFile();
	}

}
