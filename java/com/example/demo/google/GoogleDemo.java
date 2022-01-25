package com.example.demo.google;

import java.util.Scanner;

/**
 * packageName: com.example.demo.google
 * fileName   : googleDemo
 * author     : 최은아
 * date       : 2022-01-25
 * desc       : GoogleApp을 실행하는 컨트롤러
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-01-25    최은아       최초 생성
 */
public class GoogleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GoogleApp googleApp = new GoogleApp();

        System.out.println(GoogleApp.GOOGLE_APP);

        System.out.print("Google 검색 또는 URL 입력 : ");
        String word = scanner.next();

        String result = googleApp.search(word);
        System.out.println(result);
    }
}
