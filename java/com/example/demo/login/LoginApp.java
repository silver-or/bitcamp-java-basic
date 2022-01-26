package com.example.demo.login;

/**
 * packageName: com.example.demo.login
 * fileName   : LoginApp.java
 * author     : 최은아
 * date       : 2022-01-24
 * desc       : 아이디, 비번, 이름을 받아서 로그인하는 앱
 * ================================
 * DATE             AUTHOR        NOTE
 * ================================
 * 2022-01-24       최은아       최초 생성
 */

public class LoginApp {
    // 객체 : state(상태)와 behavior(기능)의 집합
    // 실행당하는 대상
    static String APPNAME = "Login APP";
    static String PASSWORD = "abc";
    private String id;
    private String pw;
    private String name;

    public String login(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        String result = "";
        if(this.pw.equals(LoginApp.PASSWORD)) {
            result = String.format("%s 님의 비번은 %s 가 맞습니다. 로그인 성공", this.name, this.pw);
        } else {
            result = String.format("%s 님의 ID는 맞고, 비번은 %s 가 아닙니다. 로그인 실패", this.id, this.pw);
        }
        return result;

    }
}
