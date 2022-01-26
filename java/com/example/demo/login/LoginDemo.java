package com.example.demo.login;

/**
 * packageName: com.example.demo.login
 * fileName   : LoginDemo.java
 * author     : 최은아
 * date       : 2022-01-24
 * desc       : LoginApp을 실행하는 컨트롤러
 * ================================
 * DATE             AUTHOR        NOTE
 * ================================
 * 2022-01-24       최은아       최초 생성
 */

import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        // demo 실행
        // control (톨제)

        Scanner scanner = new Scanner(System.in);

        LoginApp loginApp = new LoginApp();
        System.out.println(LoginApp.APPNAME);

        System.out.print("아이디 입력 : ");
        String id = scanner.next();

        System.out.print("비밀번호 입력 : ");
        String pw = scanner.next();

        System.out.print("이름 입력 : ");
        String name = scanner.next();

        String login = loginApp.login(id, pw, name);
        System.out.println(login);
    }
}
