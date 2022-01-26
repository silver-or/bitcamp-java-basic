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
 * 2022-01-26       최은아       최초 생성
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

        int total = gradeApp.getTotal(kor, eng, math);
        int avg = gradeApp.getAvg(total);
        String pass = gradeApp.getGrade(avg);

        String result = String.format("   * ########## %s ######## \n" +
                "   * 이름: %s\n" +
                "   * > 국어: %d점 \n" +
                "   * > 영어: %d점 \n" +
                "   * > 수학: %d점 \n" +
                "   * 총점: %d점 \n" +
                "   * 평균(정수): %d점 \n" +
                "   * 합격여부: %s \n" +
                "   * #######################",
                GradeApp.GRADE_TITLE, name, kor, eng, math, total, avg, pass);
        System.out.println(result);
    }
}
