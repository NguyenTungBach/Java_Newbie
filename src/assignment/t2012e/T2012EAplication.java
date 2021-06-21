package assignment.t2012e;

import assignment.t2012e.entity.Student;
import assignment.t2012e.view.StudentMenu;
import assignment.t2012e.view.TeacherMenu;

import java.util.Scanner;

// main ->menu(view) ->controller -> model
public class T2012EAplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu Manager");
            System.out.println("==========================");
            System.out.println("1. Student Manager");
            System.out.println("2. Teacher Manager");
            System.out.println("0. Exit");
            System.out.println("==========================");
            System.out.println("Please enter your choice (1-2)");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    StudentMenu studentMenu = new StudentMenu();
                    studentMenu.generateStudentMenu();
                    break;
                case 2:
                    TeacherMenu teacherMenu = new TeacherMenu();
                    teacherMenu.generateTeacherMenu();
                    break;
            }
            if (choice == 0){
                System.out.println("Program Finnish");
                break;
            }
        }
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên");
        int n = scanner.nextInt();
        scanner.nextLine();
        Student[] students = new Student[n];
//        Student student1 [] = new Student[n];
        // Nhập sinh viên
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println("Please enter student rollNumber " + i + " : ");
            String rollNumber = scanner.nextLine();
            students[i].setRollNumber(rollNumber);
            System.out.println("Please enter student fullName " + i + " : ");
            String fullName = scanner.nextLine();
            students[i].setFullName(fullName);
        }

        // Tìm kiếm sinh viên
        System.out.println("Please enter student rollNumber to find" + " : ");
        String rollNumber = scanner.nextLine();
        int check = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getRollNumber().equals(rollNumber)){
                check = i;
            }
        }
        if (check == -1){
            System.out.println("Không tìm thấy");
        } else {
            System.out.println("rollNumber "  + " = " + students[check].getRollNumber());
            System.out.println("rollNumber "  + " = " + students[check].getFullName());
        }

        // In sinh viên
//        for (int i = 0; i < students.length; i++) {
//            System.out.println("rollNumber " + i + " = " + students[i].getRollNumber());
//            System.out.println("fullName " + i + " = " + students[i].getFullName());
//        }
        */
    }
}
