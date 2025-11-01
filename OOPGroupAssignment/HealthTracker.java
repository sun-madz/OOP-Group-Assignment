/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package OOPGroupAssignment;

/**
 *
 * @author sandr
 */

import java.util.ArrayList;
import java.util.Scanner;

public class HealthTracker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<HealthRecord> records = new ArrayList<>();

        System.out.println("===== SMART HEALTH TRACKER =====");

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Activity Record");
            System.out.println("2. Add Diet Record");
            System.out.println("3. View All Records");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Adding Activity Record...");
                    // later: call ActivityRecord class
                    break;
                case 2:
                    System.out.println("Adding Diet Record...");
                    // later: call DietRecord class
                    break;
                case 3:
                    System.out.println("Displaying All Records...");
                    // later: print records
                    break;
                case 4:
                    System.out.println("Exiting Smart Health Tracker. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        input.close();
    }
}
