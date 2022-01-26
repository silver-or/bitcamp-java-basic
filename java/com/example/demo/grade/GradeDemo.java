package com.example.demo.grade;

import java.util.Scanner;

/**
 * packageName: com.example.demo.grade
 * fileName   : GradeDemo
 * author     : 최은아
 * date       : 2022-01-26
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-01-26    최은아       최초 생성
 */
public class GradeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeApp gradeApp = new GradeApp();

        System.out.print("이름 : ");
        String name = scanner.next();

        System.out.print("국어 : ");
        int kor = scanner.nextInt();

        System.out.print("영어 : ");
        int eng = scanner.nextInt();

        System.out.print("수학 : ");
        int math = scanner.nextInt();

        String result = gradeApp.getGrade(name, kor, eng, math);
        System.out.println(result);
    }
}
