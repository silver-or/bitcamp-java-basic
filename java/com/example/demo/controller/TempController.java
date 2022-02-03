package com.example.demo.controller;

import com.example.demo.domain.GradeDTO;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : TempController
 * author     : 최은아
 * date       : 2022-02-03
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-03    최은아       최초 생성
 */
public class TempController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생 수를 입력해주세요.");
        int count = scanner.nextInt();
        GradeDTO[] grades = new GradeDTO[count]; // 인스턴스를 생성 // 컨테이너 객체 (container object) → 배열 객체 (배열 인스턴스) // 부모
        for (int i = 0; i < grades.length; i++) {
//            grades[i] = null; // element
            grades[i] = new GradeDTO(); // element를 인스턴스화 // 인스턴스 (요소 객체) // 자식
            System.out.println("이름, 국어 점수, 영어 점수, 수학 점수를 입력해주세요.");
            grades[i].setName(scanner.next()); // element를 인스턴스화 해야 getter/setter를 사용할 수 있다.
            grades[i].setKor(scanner.nextInt());
            grades[i].setEng(scanner.nextInt());
            grades[i].setMath(scanner.nextInt());
        }
        for (int i = 0; i < grades.length; i++) {
            System.out.println("<<성적표>>" );
            System.out.println("이름 : " + grades[i].getName());
            System.out.println("국어 점수 : " + grades[i].getKor());
            System.out.println("영어 점수 : " + grades[i].getEng());
            System.out.println("수학 점수 : " + grades[i].getMath());
            System.out.println();
        }
    }
}
