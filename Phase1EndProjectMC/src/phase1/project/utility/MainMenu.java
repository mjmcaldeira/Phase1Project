package phase1.project.utility;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

import phase1.project.exception.ProperOptionValue;

public class MainMenu {
	
	static File rootPath = new File("//home/migueljcaldeira/Desktop/MC_Phase1Project/FileFolder");
	
	public static void menuOptions() {
		Scanner sc = new Scanner(System.in);
		String con;
		
		do {
			System.out.println("\n1: Display all files in ascending order"+"\n");
			System.out.println("2: Other options"+"\n");
			System.out.println("3: Exit"+"\n");
			System.out.println("Choose one option");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:String listOfFiles [] = rootPath.list();
				Arrays.sort(listOfFiles);
				System.out.println("\nFiles in Ascending Order:");
				for(String name:listOfFiles) {
					System.out.println(name);
				}
				
				break;
				
			case 2:SubMenu.subMenuOptions();
				
				break;
				
			case 3:System.exit(0);
				
				break;
			
			}
			
			System.out.println("Do you want to continue? (y/n)");
			con= sc.next();
			try {
			if (!con.equals("y") || !con.equals("n")) {
				 throw new ProperOptionValue("Please enter y or n \n");
			}
			}catch(Exception e) {
				System.out.print(e);
			}
		} while (con.equalsIgnoreCase("y"));
		
		
	}
}
 