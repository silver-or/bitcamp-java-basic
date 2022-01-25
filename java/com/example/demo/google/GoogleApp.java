package com.example.demo.google;

/**
 * packageName: com.example.demo.google
 * fileName   : googleApp
 * author     : 최은아
 * date       : 2022-01-25
 * desc       : 검색어를 입력하여 검색 결과를 출력하는 구글 앱
 * variable   : [클래스 변수] GOOGLE_APP
 *              [인스턴스 변수] word
 *              [지역 변수] result
 *              [매개변수] word
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-01-25    최은아       최초 생성
 */
public class GoogleApp {
    public static String GOOGLE_APP = "Google";
    private String word;

    public String search(String word) {
        this.word = word;
        String result = String.format("\'%s\'을(를) 검색한 결과입니다.", this.word);
        return result;
    }
}
