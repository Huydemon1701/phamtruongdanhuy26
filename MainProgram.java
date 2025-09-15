package personmanagement;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        PersonList list = new PersonList();
        Scanner sc = new Scanner(System.in);
        int cont = 1;

        while (cont == 1) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Enter information (Student / Teacher)");
            System.out.println("2. Display list");
            System.out.print("Choose: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter type: 1-Student, 2-Teacher");
                    int type = Integer.parseInt(sc.nextLine());
                    if (type == 1) {
                        list.addPerson(new Student());
                    } else if (type == 2) {
                        list.addPerson(new Teacher());
                    } else {
                        System.out.println("Invalid choice!");
                    }
                }
                case 2 -> list.displayList();
                default -> System.out.println("Invalid option!");
            }

            System.out.print("Continue? 1-Yes, 0-No: ");
            cont = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Program ended.");
    }
}

