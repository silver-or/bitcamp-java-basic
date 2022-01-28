package com.example.demo.service;

import com.example.demo.domain.LoginDTO;

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

public class LoginService {
    public String execute(LoginDTO login) {
        // demo 실행
        // control (톨제)
        return (login.getPw().equals("abc")) ? String.format("%s 님의 비번은 %s 가 맞습니다. 로그인 성공", login.getName(), login.getPw())
                : String.format("%s 님의 ID는 맞고, 비번은 %s 가 아닙니다. 로그인 실패", login.getId(), login.getPw());
    }
}