package com.wenyu.admin.dao;

import com.wenyu.admin.bean.Student;
import com.wenyu.admin.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dayu on 2017/1/4.
 */
public class StudentDaoTest extends AbstractTest{
    @Autowired
    private StudentDao studentDao;
    @Test
    public void testLoadStudentById() {
        Student student = studentDao.loadStudentById(1);
        System.out.print(student);
    }
    @Test
    public void testQueryStudent(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("studentName", "wenyu");
        List<Student> students = studentDao.queryStudent(map);
        System.out.print(students);

    }
}