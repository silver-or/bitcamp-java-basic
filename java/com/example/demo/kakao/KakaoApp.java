package com.example.demo.kakao;

/**
 * packageName: com.example.demo.kakao
 * fileName   : KakaoApp.java
 * author     : 최은아
 * date       : 2022-01-24
 * desc       : 전화번호와 메시지를 입력받아 출력하는 앱
 * ================================
 * DATE             AUTHOR        NOTE
 * ================================
 * 2022-01-24       최은아       최초 생성
 */

/*
* 전화번호와 메시지를 받아서 전송하는 어플을 만드시오
* String telno, String message
* */

public class KakaoApp {
    static String APPNAME = "Kakao APP";
    private String telno;
    private String message;

    public String kakao(String telno, String message) {
        this.telno = telno;
        this.message = message;
        return String.format("telno %s, message %s", telno, message);
    }
}
