package com.hibernate;

import com.DAO.StudentDao;
import com.Model.Student;

public class App {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();

        Student student = new Student("Ashraf","LastName","ashraf@123");

        studentDao.saveStudent(student);
    }
}
