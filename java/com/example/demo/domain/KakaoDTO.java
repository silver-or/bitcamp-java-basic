package com.example.demo.domain;

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

public class KakaoDTO {
    static String KAKAO_APP = "Kakao APP";
    private String telno;
    private String message;

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
