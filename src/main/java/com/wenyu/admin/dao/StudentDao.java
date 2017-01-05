package com.wenyu.admin.dao;

import com.wenyu.admin.bean.Student;

import java.util.List;
import java.util.Map;

/**
 * Created by dayu on 2017/1/4.
 */
public interface StudentDao {
    Student loadStudentById(int id);
    List<Student> queryStudent(Map<String, Object> map);
}
