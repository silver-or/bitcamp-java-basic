package com.example.demo.hello;

import java.util.Scanner;

public class HelloDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HelloApp helloApp = new HelloApp();
        System.out.println(HelloApp.APPNAME);

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
