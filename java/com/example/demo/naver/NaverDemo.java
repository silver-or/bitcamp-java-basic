package com.example.demo.naver;

import java.util.Scanner;

/**
 * packageName: com.example.demo.naver
 * fileName   : NaverDemo
 * author     : 최은아
 * date       : 2022-01-25
 * desc       : NaverApp을 실행하는 컨트롤러
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-01-25    최은아       최초 생성
 */
public class NaverDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NaverApp naverApp = new NaverApp();

        System.out.println(NaverApp.NAVER_APP);

        System.out.print("id : ");
        String id = scanner.next();

        System.out.print("pw : ");
        String pw = scanner.next();

        String result = naverApp.login(id, pw);
        System.out.println(result);;
    }
}
