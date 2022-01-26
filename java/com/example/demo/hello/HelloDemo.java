package com.example.demo.hello;

/**
 * packageName: com.example.demo.hello
 * fileName   : HelloDemo.java
 * author     : 최은아
 * date       : 2022-01-24
 * desc       : HelloApp을 실행하는 컨트롤러
 * ================================
 * DATE             AUTHOR        NOTE
 * ================================
 * 2022-01-24       최은아       최초 생성
 */


import java.util.Scanner;

public class HelloDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HelloApp helloApp = new HelloApp();
        System.out.println(HelloApp.HELLO_APP);

        String name;
        int age;

        System.out.print("이름 : ");
        name = scanner.next();
        System.out.print("나이 : ");
        age = scanner.nextInt();

        String res = helloApp.hello(name, age);
        System.out.println(res);
    }
}
