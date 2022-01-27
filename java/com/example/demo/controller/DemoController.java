package com.example.demo.controller;

import com.example.demo.bmi.BmiApp;
import com.example.demo.bmi.BmiDemo;
import com.example.demo.calc.CalcApp;
import com.example.demo.calc.CalcDemo;
import com.example.demo.google.GoogleApp;
import com.example.demo.google.GoogleDemo;
import com.example.demo.grade.GradeApp;
import com.example.demo.grade.GradeDemo;
import com.example.demo.login.LoginApp;
import com.example.demo.login.LoginDemo;

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
        BmiDemo bmiDemo = new BmiDemo();
        CalcDemo calcDemo = new CalcDemo();
        GoogleDemo googleDemo = new GoogleDemo();
        GradeDemo gradeDemo = new GradeDemo();
        LoginDemo loginDemo = new LoginDemo();
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
                    System.out.println(BmiApp.BMI_APP + "\n이름 : \n키 : \n몸무게 : \n");
                    System.out.println(bmiDemo.execute(scanner.next(), scanner.nextDouble(), scanner.nextDouble()));
                    break;
                case "2" :
                    System.out.println(CalcApp.CALC + "\n첫 번째 숫자 : \n연산자 : \n두 번째 숫자 : \n");
                    System.out.println(calcDemo.execute(scanner.nextInt(), scanner.next(), scanner.nextInt()));
                    break;
                case "3" :
                    System.out.println(GoogleApp.GOOGLE_APP + "\nGoogle 검색 또는 URL 입력 : ");
                    System.out.println(googleDemo.execute(scanner.next()));
                    break;
                case "4" :
                    System.out.println(GradeApp.GRADE_TITLE + "\n이름 : \n국어 : \n영어 : \n수학 : \n");
                    System.out.println(gradeDemo.execute(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                    break;
                case "5" :
                    System.out.println(LoginApp.LOGIN_APP + "\n아이디 : \n비밀번호 : \n이름 : \n");
                    System.out.println(loginDemo.execute(scanner.next(), scanner.next(), scanner.next()));
                    break;
                default :
                    result = "선택된 메뉴가 없습니다. 1~5 사이의 숫자를 입력해주세요.";
            }
            System.out.println(result);
        }
    }
}
