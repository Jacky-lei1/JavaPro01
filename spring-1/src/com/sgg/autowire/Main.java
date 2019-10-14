package com.sgg.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 绿野蓝杉
 * @create 2019-10-11 0:13
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-autowire.xml");
        Person person = (Person) context.getBean("person");

        System.out.println(person);
    }
}
