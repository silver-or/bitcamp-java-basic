package com.example.demo.calc;

import java.util.Scanner;

public class CalcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CalcApp calcApp = new CalcApp();
        System.out.println(CalcApp.CALC);

        int num1, num2;
        String opcode = "";

        System.out.print("첫 번째 값 입력 : ");
        num1 = scanner.nextInt();

        System.out.print("연산자 입력 : ");
        scanner.nextLine();
        opcode = scanner.nextLine();

        System.out.print("두 번째 값 입력 : ");
        num2 = scanner.nextInt();

        String result = calcApp.calc(num1, opcode, num2);
        System.out.println(result);
    }
}
