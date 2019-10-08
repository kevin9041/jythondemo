package com.movitech.python.jython;

public class Persion {

    private static String staticVar= "ssssss";

    private String type = "人类";
    private String name ;
    private Integer age;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Persion(String name) {
        this.name = name;
    }

    public static String getStaticVar() {
        return staticVar;
    }

    public static void setStaticVar(String staticVar) {
        Persion.staticVar = staticVar;
    }
}