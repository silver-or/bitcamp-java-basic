package com.example.demo.auth.domain;

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

public class UserDTO {
    // 객체 : state(상태)와 behavior(기능)의 집합
    // 실행당하는 대상
    public static String LOGIN_APP = "Login APP";

    private final static UserDTO userDTO = new UserDTO();
    private UserDTO(){}
    public static UserDTO getInstance(){ return userDTO; }

    private String id;
    private String pw;
    private String name;
    public static String PASSWORD = "abc";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
