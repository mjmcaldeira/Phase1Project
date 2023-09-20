package phase1.project.com;

import phase1.project.utility.MainMenu;

public class AppLockers {

	public static void main(String[] args) {
		System.out.println("****************************************");
        System.out.println("*      Welcome to AppLockers.com       *");
        System.out.println("*      Developer: Miguel Caldeira      *");
        System.out.println("*      Version 1.0.1                   *");
        System.out.println("****************************************");
        
        
        int directoryStatus = MainMenu.createDirectoryIfNotExists();

        if (directoryStatus == 0) {
            MainMenu.menuOptions();
        	      	
         
             	
        } else {
            System.err.println("Application initialization failed. Exiting...");
            System.exit(1);
        }
    }
}
