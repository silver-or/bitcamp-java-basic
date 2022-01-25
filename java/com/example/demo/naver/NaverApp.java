package com.example.demo.naver;

/**
 * packageName: com.example.demo.naver
 * fileName   : NaverApp
 * author     : 최은아
 * date       : 2022-01-25
 * desc       : 아이디와 비밀번호를 입력받아 로그인하는 네이버 앱
 * variable   : [클래스 변수] NAVER_APP
 *              [인스턴스 변수] id, pw
 *              [지역 변수] result
 *              [매개변수] id, pw
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-01-25    최은아       최초 생성
 */
public class NaverApp {
    public static String NAVER_APP = "NAVER";
    private String id;
    private String pw;

    public String login(String id, String pw) {
        this.id = id;
        this.pw = pw;
        String result = String.format("%s 님 로그인 성공하셨습니다.", this.id);
        return result;
    }
}
