package com.hp.entity;

import com.hp.BasicSpringContextTest;
import com.hp.utils.Constants;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest extends BasicSpringContextTest {

    @Test
    public void testToString(){
        ApplicationContext context = new ClassPathXmlApplicationContext(Constants.APPCONTEXT_CORE);
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
}
