package assignment.t2012e.model;

import assignment.t2012e.entity.Teacher;

import java.util.ArrayList;

public class TeacherModel {
    ArrayList <Teacher> list;
    {
        list = new ArrayList<>();
        list.add(new Teacher("at1","Death","Death@","789"));
        list.add(new Teacher("bt1","Asura","Asura@","236"));
        list.add(new Teacher("ct1","Queen","Queen@","258"));
    }

    public boolean save (Teacher obj){ // Thêm sinh viên
        list.add(obj);
        return true;
    }

    public ArrayList <Teacher> findAll(){ // Trả về tất cả sinh viên
        return list;
    }

    public Teacher findByID(String id){
        Teacher teacher = null;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getRollNumber().equals(id)){
                teacher = list.get(i);
            }
        }
        return teacher;
    }

    public boolean update(String id, Teacher updateObj){ //sửa
        Teacher existingTeacher = findByID(id);
        if (existingTeacher == null){
            return false;
        }
        existingTeacher.setFullName(updateObj.getFullName());
        existingTeacher.setEmail(updateObj.getEmail());
        existingTeacher.setPhone(updateObj.getPhone());
        return true;
    }

    public boolean delete(String id){ // xóa
        Teacher existingStudent = findByID(id);
        if (existingStudent == null){
            return false;
        }
        list.remove(existingStudent);
        return true;
    }
}
