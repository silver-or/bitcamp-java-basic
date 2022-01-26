package com.example.demo.calc;

/**
 * packageName: com.example.demo.calc
 * fileName   : CalcDemo.java
 * author     : 최은아
 * date       : 2022-01-24
 * desc       : CalcApp을 실행하는 컨트롤러
 * ================================
 * DATE             AUTHOR        NOTE
 * ================================
 * 2022-01-24       최은아       최초 생성
 */

import java.util.Scanner;

public class CalcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CalcApp calcApp = new CalcApp();
        System.out.println(CalcApp.CALC);

        System.out.print("첫 번째 값 입력 : ");
        int num1 = scanner.nextInt();

        System.out.print("연산자 입력 (+, -, *, /, %) : ");
        scanner.nextLine();
        String opcode = scanner.nextLine();

        System.out.print("두 번째 값 입력 : ");
        int num2 = scanner.nextInt();

        String result = calcApp.calc(num1, opcode, num2);
        System.out.println("연산 결과 : " + result);
    }
}
