package phase1.project.utility;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SubMenu {

    static File rootPath = new File("FileFolder");

    public static void subMenuOptions() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\nFile handling options:");
            System.out.println("\n1: Create a file");
            System.out.println("\n2: Delete a file");
            System.out.println("\n3: Search a file");
            System.out.println("\n4: Return to previous menu");
            System.out.println("\nChoose an option:");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    createFile(sc);
                    break;
                case 2:
                    deleteFile(sc);
                    break;
                case 3:
                    searchFile(sc);
                    break;
                case 4:
                    return ; // Return to the main context
                default:
                    System.out.println("Invalid choice, please enter a valid option\n");
            }

        } while (true);
    }

    private static void createFile(Scanner sc) {
        System.out.println("Enter the name of the file to add:");
        String fileName = sc.nextLine();
        File fileToCreate = new File(rootPath, fileName);

        try {
            if (fileToCreate.createNewFile()) {
                System.out.println("File '" + fileName + "' created successfully.");
            } else {
                System.out.println("File '" + fileName + "' already exists.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while creating the file.");
        }
    }

    private static void deleteFile(Scanner sc) {
        System.out.println("Enter the name of the file to delete:");
        String fileName = sc.nextLine();
        File fileToDelete = new File(rootPath, fileName);

        if (fileToDelete.delete()) {
            System.out.println("File '" + fileName + "' deleted successfully.");
        } else {
            System.out.println("File '" + fileName + "' does not exist.");
        }
    }

    private static void searchFile(Scanner sc) {
        System.out.println("Enter the name of the file to search:");
        String fileName = sc.nextLine();
        File fileToSearch = new File(rootPath, fileName);

        if (fileToSearch.exists()) {
            System.out.println("File '" + fileName + "' found.");
        } else {
            System.out.println("File '" + fileName + "' not found.");
        }
    }
}
