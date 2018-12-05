package com.hp.service;

import com.alibaba.fastjson.JSON;
import com.hp.BasicSpringContextTest;
import com.hp.entity.Student;
import com.hp.enums.GenderEnum;
import org.junit.Test;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class StudentServiceTest extends BasicSpringContextTest {

    @Resource
    private StudentService studentService;

    public Student init(){
        Student student = new Student();
        student.setSno(12402025);
        student.setName("013");
        student.setGender(GenderEnum.FEMALE.getCode());
        student.setAge(26);
        student.setSdept("电器自动化");
        Date date = new Date();
        student.setCreateTime(date);
        student.setUpdateTime(date);
        return student;
    }

    @Test
    public void testCreate(){
        Student student = init();
        System.out.println("要插入的数据为：" + JSON.toJSONString(student));
        //成功插入的数量
        int count = studentService.create(student);
        System.out.println(String.format("create success, 影响的行数为 = %s，成功插入数据的主键id = %s", count, student.getId()));
    }

    @Test
    public void test_loadById(){
        Student studentQuery = studentService.loadById(3);
        System.out.println("studentQuery = " + studentQuery);
    }

    @Test
    public void test_update(){
        Student student = new Student();
        student.setId(5);
        student.setName("005");
        student.setGender(GenderEnum.MALE.getCode());
        student.setAge(26);
        student.setSdept("体育");
        student.setUpdateTime(new Date());
        studentService.update(student);
    }

    @Test
    public void test_deleteById(){
        studentService.deleteById(6);
    }

    @Test
    public void Test_fuzzySearchAndCount(){
        List<Student> studentList = studentService.fuzzySearch("", 0, 10);
        System.out.println("查询到的学生信息数据为：");
        studentList.forEach(System.out::println);
        System.out.println("---------");
        int count = studentService.fuzzySearchCount("", 0, 10);
        System.out.println("查询到的学生信息数量为：" + count);
    }

    @Test
    public void testCurrentDateTime(){
        Date now = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        System.out.println(format.format(now));
    }
}
