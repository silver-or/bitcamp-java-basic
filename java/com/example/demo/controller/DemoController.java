package com.example.demo.controller;

import com.example.demo.calc.CalcDemo;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController
 * author     : 최은아
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-01-27       최은아       최초 생성
 */
public class DemoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcDemo calcDemo = new CalcDemo();
        System.out.println("메뉴 선택");
        while (true) {
            String menu = "0.EXIT 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String select = scanner.next();
            String result = "";
            switch (select) {
                case "0" :
                    System.out.println("Exit"); return;
                case "1" :
                    result = "BMI"; break;
                case "2" :
                    result = "CALC";
                    calcDemo.execute();
                    break;
                case "3" :
                    result = "SEARCH"; break;
                case "4" :
                    result = "GRADE"; break;
                case "5" :
                    result = "LOGIN"; break;
                default :
                    result = "선택된 메뉴가 없습니다. 1~5 사이의 숫자를 입력해주세요.";
            }
            System.out.println(result);
        }
    }
}
