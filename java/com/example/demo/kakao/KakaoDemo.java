package com.example.demo.kakao;

import java.util.Scanner; // 가져오기
//import com.example.demo.kakao.KakaoApp // 같은 패키지는 import 생략 가능

public class KakaoDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 다운

        KakaoApp kakaoApp = new KakaoApp();
        System.out.println(KakaoApp.APPNAME);
//        System.out.println(kakaoApp.APPNAME);

        String telno;
        String message;

        System.out.print("전화번호 입력 : ");
        telno = scanner.next();

        scanner.nextLine();
        System.out.print("메시지 입력 : ");
        message = scanner.next();

        System.out.println(kakaoApp.kakao(telno, message));
    }
}