package assignment.t2012e.model;

import assignment.t2012e.entity.Student;

import java.util.ArrayList;

public class StudentModel {
    ArrayList <Student> list;
    {
        list = new ArrayList<>();
        list.add(new Student("as1","aaa","a@","123"));
        list.add(new Student("bs1","bbb","b@","234"));
        list.add(new Student("cs1","ccc","c@","456"));
    }

    public boolean save (Student obj){ // Thêm sinh viên
        list.add(obj);
        return true;
    }

    public ArrayList <Student> findAll(){ // Trả về tất cả sinh viên
        return list;
    }

    public Student findByID(String id){
        Student student = null;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getRollNumber().equals(id)){
                student = list.get(i);
            }
        }
        return student;
    }

    public boolean update(String id, Student updateObj){ //sửa
        Student existingStudent = findByID(id);
        if (existingStudent == null){
            return false;
        }
        existingStudent.setFullName(updateObj.getFullName());
        existingStudent.setEmail(updateObj.getEmail());
        existingStudent.setPhone(updateObj.getPhone());
        return true;
    }

    public boolean delete(String id){ // xóa
        Student existingStudent = findByID(id);
        if (existingStudent == null){
            return false;
        }
        list.remove(existingStudent);
        return true;
    }
}
