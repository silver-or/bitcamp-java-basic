package com.example.demo.login;

public class LoginApp {
    // 객체 : state(상태)와 behavior(기능)의 집합
    // 실행당하는 대상
    static String APPNAME = "Login APP";
    private String id;
    private String pw;
    private String name;

    public String login(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        return String.format("ID %s, PW %s, Name %s", this.id, this.pw, this.name);
    }
}
