package com.example.demo.hello;

public class HelloApp {
    static String APPNAME = "Hello APP";
    private String name;
    private int age;

    public String hello(String name, int age) {
        this.name = name;
        this.age = age;
        return String.format("안녕 내 이름은 %s이고 %d살이야.", this.name, this.age);
    }
}
