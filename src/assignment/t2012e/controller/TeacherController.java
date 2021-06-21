package assignment.t2012e.controller;
import assignment.t2012e.entity.Teacher;
import assignment.t2012e.model.TeacherModel;


import java.util.ArrayList;
import java.util.Scanner;

public class TeacherController {
    private TeacherModel teacherModel = new TeacherModel();
    Scanner scanner= new Scanner(System.in);

    public void create(){
        System.out.println("Create teacher");

        Teacher teacher = new Teacher();
        System.out.println("Please enter teacher rollNumber: ");
        String rollNumber = scanner.nextLine();
        teacher.setRollNumber(rollNumber);
        System.out.println("Please enter teacher fullName: ");
        String fullName = scanner.nextLine();
        teacher.setFullName(fullName);
        System.out.println("Please enter teacher email: ");
        String email = scanner.nextLine();
        teacher.setEmail(email);
        System.out.println("Please enter teacher phone: ");
        String phone = scanner.nextLine();
        teacher.setPhone(phone);
        if(teacherModel.save(teacher)){
            System.out.println("Action success");
        } else {
            System.out.println("Action failse");
        }
    }

    public void showList(){
        System.out.println("Show list teacher");
        System.out.printf("%5s%6s%5s | %1s%21s%14s | %5s%15s%15s | %5s%10s%5s",
                "","RollNumber", "",
                "","FullNumber", "",
                "","Email", "",
                "","Phone", "");
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
        ArrayList<Teacher> list = teacherModel.findAll();
        for (int i = 0; i < list.size(); i++) {
            Teacher teacher = list.get(i);
            System.out.println(teacher.toString());
        }
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
    }

    public void search(){
        System.out.println("Search teacher by rollNumber");
        System.out.println("Enter rollNumber");
        String rollNumber = scanner.nextLine();
        Teacher teacher = teacherModel.findByID(rollNumber);
        if (teacher == null){
            System.out.println("Teacher is not found\n");
        } else {
            System.out.printf("%5s%6s%5s | %1s%21s%14s | %5s%15s%15s | %5s%10s%5s",
                    "","RollNumber", "",
                    "","FullNumber", "",
                    "","Email", "",
                    "","Phone", "");
            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(teacher.toString());
        }
    }

    public void edit(){
        System.out.println("Search teacher by rollNumber");
        System.out.println("Enter rollNumber");
        String rollNumber = scanner.nextLine();
        Teacher teacher = teacherModel.findByID(rollNumber);
        if (teacher == null){
            System.out.println("Teacher is not found\n");
        } else {
            System.out.printf("%5s%6s%5s | %1s%21s%14s | %5s%15s%15s | %5s%10s%5s",
                    "","RollNumber", "",
                    "","FullNumber", "",
                    "","Email", "",
                    "","Phone", "");
            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(teacher.toString());
        }
        System.out.println("Please enter teacher fullName: ");
        String fullName = scanner.nextLine();
        teacher.setFullName(fullName);
        System.out.println("Please enter teacher email: ");
        String email = scanner.nextLine();
        teacher.setEmail(email);
        System.out.println("Please enter teacher phone: ");
        String phone = scanner.nextLine();
        teacher.setPhone(phone);
        if (teacherModel.update(rollNumber,teacher)){
            System.out.println("Update Teacher id = " + teacher.getRollNumber() + " success\n" );
        } else {
            System.out.println("Update Teacher id = " + teacher.getRollNumber() + " failse\n" );
        }
    }

    public void delete(){
        System.out.println("Delete teacher by rollNumber");
        String rollNumber = scanner.nextLine();
        Teacher teacher = teacherModel.findByID(rollNumber);
        if (teacher == null){
            System.out.println("Teacher is not found\n");
        } else {
            System.out.printf("%5s%6s%5s | %1s%21s%14s | %5s%15s%15s | %5s%10s%5s",
                    "","RollNumber", "",
                    "","FullNumber", "",
                    "","Email", "",
                    "","Phone", "");
            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(teacher.toString());

            System.out.println("Are you sure (y/n)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("y")){
                if (teacherModel.delete(rollNumber)){
                    System.out.println("Delete Teacher id " + teacher.getRollNumber() + " success\n");
                } else {
                    System.out.println("Delete Teacher id " + teacher.getRollNumber() + " failse\n");
                }
            }
        }
    }
}
