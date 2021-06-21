package assignment.t2012e.view;
import assignment.t2012e.controller.TeacherController;

import java.util.Scanner;

public class TeacherMenu {
    public void generateTeacherMenu() {
        Scanner scanner = new Scanner(System.in);
        TeacherController teacherController = new TeacherController();
        while (true) {
            System.out.println("Teacher Manager");
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
                    teacherController.create();
                    break;
                case 2:
                    teacherController.showList();
                    break;
                case 3:
                    teacherController.search();
                    break;
                case 4:
                    teacherController.edit();
                    break;
                case 5:
                    teacherController.delete();
                    break;
            }
            if (choice == 0){
                System.out.println("Program Manage Teacher Finnish\n");
                break;
            }
        }
    }
}
