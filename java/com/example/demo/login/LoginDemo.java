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
    public String execute(String id, String pw, String name) {
        // demo 실행
        // control (톨제)
        LoginApp loginApp = new LoginApp();
        return loginApp.login(id, pw, name);
    }
}
