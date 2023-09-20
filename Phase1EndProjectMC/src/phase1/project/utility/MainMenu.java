package phase1.project.utility;

import java.io.File;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MainMenu {
	
	// Use a relative path to access the "FileFolder" directory
    static File rootPath = new File("FileFolder");

    public static int createDirectoryIfNotExists() {
        // Check and create the directory if it doesn't exist
        if (!rootPath.exists()) {
            boolean created = rootPath.mkdir();
            if (created) {
//                System.out.println("Directory 'FileFolder' created successfully.");
                return 0; // Directory created successfully
            } else {
                System.err.println("Failed to create the 'FileFolder' directory.");
                return 1; // Directory creation failed
            }
        }
        return 0; // Directory already exists
    }

    public static void menuOptions() {
        Scanner sc = new Scanner(System.in);
        String con = null;

        int directoryStatus = createDirectoryIfNotExists();
        if (directoryStatus == 1) {
            System.exit(1); // Exit the program if directory creation fails
        }
		
		
		do {
			System.out.println("\n Choose one option:");
			System.out.println("\n1: Display all files in ascending order"+"\n");
			System.out.println("2: Other options"+"\n");
			System.out.println("3: Exit"+"\n");
			
					

			int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine(); // Consume the invalid input
                System.out.println("Invalid choice, please enter a valid option\n");
                continue; // Continue the loop to ask again for a valid choice
            }

            switch (choice) {
                case 1:
                    String[] listOfFiles = rootPath.list();
                    Arrays.sort(listOfFiles);
                    System.out.println("\nFiles in Ascending Order:");
                    for (String name : listOfFiles) {
                        System.out.println(name);
                    }

                    break;

                case 2:
                    SubMenu.subMenuOptions();

                    break;

                case 3:
                    System.out.println("Exiting.... Thank you!\n");
                    System.exit(0);

                    break;

                default:
                    System.out.println("Invalid choice, please enter a valid option\n");
            }

            do {
                System.out.println("Do you want to continue? (y/n)");
                con = sc.next();

                if (!con.equals("y") && !con.equals("n")) {
                    System.out.println("\nPlease enter y or n\n");
                }

            } while (!con.equalsIgnoreCase("y") && !con.equalsIgnoreCase("n"));
            System.out.println("Exiting.... Thank you!\n");
        } while (con.equalsIgnoreCase("y"));
    }
}
 