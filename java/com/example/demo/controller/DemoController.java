package com.example.demo.controller;

import com.example.demo.domain.BmiDTO;
import com.example.demo.service.BmiService;
import com.example.demo.domain.CalcDTO;
import com.example.demo.service.CalcService;
import com.example.demo.domain.GoogleDTO;
import com.example.demo.service.GoogleService;
import com.example.demo.domain.GradeDTO;
import com.example.demo.service.GradeService;
import com.example.demo.domain.LoginDTO;
import com.example.demo.service.LoginService;

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
 * 2022-01-27    최은아       최초 생성
 */
public class DemoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BmiDTO bmi = new BmiDTO();
        CalcDTO calc = new CalcDTO();
        GoogleDTO google = new GoogleDTO();
        GradeDTO grade = new GradeDTO();
        LoginDTO login = new LoginDTO();

        BmiService bmiService = new BmiService();
        CalcService calcService = new CalcService();
        GoogleService googleService = new GoogleService();
        GradeService gradeService = new GradeService();
        LoginService loginService = new LoginService();

        System.out.println("메뉴 선택");
        while (true) {
            String menu = "0.EXIT 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String select = scanner.next();
            String result = "";
            switch (select) {
                case "0":
                    System.out.println("Exit");
                    return;
                case "1":
                    System.out.println(BmiDTO.BMI_APP + "\n이름 : \n키 : \n몸무게 : ");
                    bmi.setName(scanner.next());
                    bmi.setHeight(scanner.nextDouble());
                    bmi.setWeight(scanner.nextDouble());
                    result = bmiService.getBMI(bmi);
                    break;
                case "2":
                    System.out.println(CalcDTO.CALC + "\n첫 번째 숫자 : \n연산자 (+, -, *, /, %) : \n두 번째 숫자 : ");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    result = calcService.getCalc(calc);
                    break;
                case "3":
                    System.out.println(GoogleDTO.GOOGLE_APP + "\nGoogle 검색 또는 URL 입력 : ");
                    google.setWord(scanner.next());
                    result = googleService.search(google);
                    break;
                case "4":
                    System.out.println(GradeDTO.GRADE_TITLE + "\n이름 : \n국어 : \n영어 : \n수학 : ");
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    result = gradeService.getGrade(grade);
                    break;
                case "5":
                    System.out.println(LoginDTO.LOGIN_APP + "\n아이디 : \n비밀번호 : \n이름 : ");
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    login.setName(scanner.next());
                    result = loginService.login(login);
                    break;
                default:
                    result = "선택된 메뉴가 없습니다. 1~5 사이의 숫자를 입력해주세요.";
            }
            System.out.println(result);
        }
    }
}
