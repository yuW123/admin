package com.wenyu.admin.service;

import com.wenyu.admin.bean.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by dayu on 2017/1/5.
 */
public class StudentServiceTest {
    @Autowired
    StudentService studentService;

    @Test
    public void testQuery() {
        Student student = studentService.query(1);
        System.out.print(student);
    }

}