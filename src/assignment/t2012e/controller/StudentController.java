package assignment.t2012e.controller;

import assignment.t2012e.entity.Student;
import assignment.t2012e.model.StudentModel;

import java.io.FileOutputStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentController {
    private StudentModel studentModel = new StudentModel();
    Scanner scanner= new Scanner(System.in);

    public void create(){
        System.out.println("Create student");

        Student student = new Student();
        System.out.println("Please enter student rollNumber: ");
        String rollNumber = scanner.nextLine();
        student.setRollNumber(rollNumber);
        System.out.println("Please enter student fullName: ");
        String fullName = scanner.nextLine();
        student.setFullName(fullName);
        System.out.println("Please enter student email: ");
        String email = scanner.nextLine();
        student.setEmail(email);
        System.out.println("Please enter student phone: ");
        String phone = scanner.nextLine();
        student.setPhone(phone);
        if(studentModel.save(student)){
            System.out.println("Action success");
        } else {
            System.out.println("Action failse");
        }
    }

    public void showList(){
        System.out.println("Show list student");
        System.out.printf("%5s%6s%5s | %1s%21s%14s | %5s%15s%15s | %5s%10s%5s",
                "","RollNumber", "",
                "","FullNumber", "",
                "","Email", "",
                "","Phone", "");
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
        ArrayList <Student> list = studentModel.findAll();
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.toString());
        }
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
    }

    public void search(){
        System.out.println("Search student by rollNumber");
        System.out.println("Enter rollNumber");
        String rollNumber = scanner.nextLine();
        Student student = studentModel.findByID(rollNumber);
        if (student == null){
            System.out.println("Student is not found\n");
        } else {
            System.out.printf("%5s%6s%5s | %1s%21s%14s | %5s%15s%15s | %5s%10s%5s",
                    "","RollNumber", "",
                    "","FullNumber", "",
                    "","Email", "",
                    "","Phone", "");
            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(student.toString());
        }

//        for (int i = 0; i < list.size(); i++) {
//            Student student = list.get(i);
//            if (student.getRollNumber().equals(rollNumber)){
//                System.out.printf("%5s%6s%5s | %1s%21s%14s | %5s%15s%15s | %5s%10s%5s",
//                        "","RollNumber", "",
//                        "","FullNumber", "",
//                        "","Email", "",
//                        "","Phone", "");
//                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
//                System.out.println(student.toString());
//                return student;
//            }
//        }
//        return null; // nếu ko tìm thấy thì trả về null
    }

    public void edit(){
//        // Nhập mã sinh viên
        System.out.println("Edit student by rollNumber");
//        System.out.println("Enter rollNumber");
//        String rollNumber = scanner.nextLine();
//        // xét list mã sinh viên
//        for (int i = 0; i < list.size(); i++) {
//            Student student = list.get(i); // danh sách sinh viên thứ i
//            if (student.getRollNumber().equals(rollNumber)){ // Nếu nhập đúng mã sinh viên thì giữ nguyên mã và thay đổi thuộc tính
//                System.out.println("Please enter student fullName: ");
//                String fullName = scanner.nextLine();
//                student.setFullName(fullName);
//                System.out.println("Please enter student email: ");
//                String email = scanner.nextLine();
//                student.setEmail(email);
//                System.out.println("Please enter student phone: ");
//                String phone = scanner.nextLine();
//                student.setPhone(phone);
////                list.set(i, student);
//                showList();
//                return student;
//            }
//        }
//        System.out.println("Không tìm thấy ");
        String rollNumber = scanner.nextLine();
        Student student = studentModel.findByID(rollNumber);
        if (student == null){
            System.out.println("Student is not found\n");
        } else {
            System.out.printf("%5s%6s%5s | %1s%21s%14s | %5s%15s%15s | %5s%10s%5s",
                    "","RollNumber", "",
                    "","FullNumber", "",
                    "","Email", "",
                    "","Phone", "");
            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(student.toString());
        }
        System.out.println("Please enter student fullName: ");
        String fullName = scanner.nextLine();
        student.setFullName(fullName);
        System.out.println("Please enter student email: ");
        String email = scanner.nextLine();
        student.setEmail(email);
        System.out.println("Please enter student phone: ");
        String phone = scanner.nextLine();
        student.setPhone(phone);
        if (studentModel.update(rollNumber,student)){
            System.out.println("Update Student id = " + student.getRollNumber() + " success\n" );
        } else {
            System.out.println("Update Student id = " + student.getRollNumber() + " failse\n" );
        }
    }

    public void delete(){
        System.out.println("Delete student by rollNumber");
//        System.out.println("Enter rollNumber");
//        String rollNumber = scanner.nextLine();
//        for (int i = 0; i < list.size(); i++) {
//            Student student = list.get(i);
//            if (student.getRollNumber().equals(rollNumber)){
//                list.remove(i);
//                showList();
//                return student;
//            }
//        }
//        System.out.println("Không tìm thấy ");
//        return null;
        String rollNumber = scanner.nextLine();
        Student student = studentModel.findByID(rollNumber);
        if (student == null){
            System.out.println("Student is not found\n");
        } else {
            System.out.printf("%5s%6s%5s | %1s%21s%14s | %5s%15s%15s | %5s%10s%5s",
                    "","RollNumber", "",
                    "","FullNumber", "",
                    "","Email", "",
                    "","Phone", "");
            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(student.toString());

            System.out.println("Are you sure (y/n)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("y")){
                if (studentModel.delete(rollNumber)){
                    System.out.println("Delete student id " + student.getRollNumber() + " success\n");
                } else {
                    System.out.println("Delete student id " + student.getRollNumber() + " failse\n");
                }
            }
        }
    }


}
