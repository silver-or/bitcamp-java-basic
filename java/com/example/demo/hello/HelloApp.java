package com.example.demo.hello;

/**
 * packageName: com.example.demo.hello
 * fileName   : HelloApp.java
 * author     : 최은아
 * date       : 2022-01-24
 * desc       : 이름과 나이를 입력받아 인사말을 리턴하는 앱
 * ================================
 * DATE             AUTHOR        NOTE
 * ================================
 * 2022-01-24       최은아       최초 생성
 */

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
