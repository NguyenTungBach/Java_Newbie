package assignment.t2012e.view;

import assignment.t2012e.controller.StudentController;

import java.util.Scanner;

public class StudentMenu {
    public void generateStudentMenu() {
        Scanner scanner = new Scanner(System.in);
        StudentController studentController = new StudentController();
        while (true) {
            System.out.println("Student Manager");
            System.out.println("==========================");
            System.out.println("1. Create");
            System.out.println("2. Show List");
            System.out.println("3. Search by rollNumber");
            System.out.println("4. Edit");
            System.out.println("5. Delete");
            System.out.println("0. Exit");
            System.out.println("==========================");
            System.out.println("Please enter your choice (1-5)");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    studentController.create();
                    break;
                case 2:
                    studentController.showList();
                    break;
                case 3:
                    studentController.search();
                    break;
                case 4:
                    studentController.edit();
                    break;
                case 5:
                    studentController.delete();
                    break;
            }
            if (choice == 0){
                System.out.println("Program Manage Student Finnish\n");
                break;
            }
        }
    }
}
