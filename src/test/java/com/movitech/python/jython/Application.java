package com.movitech.python.jython;

import org.junit.Test;

public class Application {

    @Test
    public void test1(){
        Student student = new Student("");
        System.out.println(student.getType());

        student.setType("学生");
        System.out.println(student.getType());

        System.out.println(Student.getStaticVar());
    }
}