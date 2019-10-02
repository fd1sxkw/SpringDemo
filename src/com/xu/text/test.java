package com.xu.text;

import com.xu.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String args[]){
        //加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //把id是student的Bean拿出来，强制转换。执行从springIOC容器中获得一个id为student的对象
        Student student = (Student) context.getBean("student",Student.class);
        System.out.println(student.getStuNo());
        ((ClassPathXmlApplicationContext) context).close();
    }
}