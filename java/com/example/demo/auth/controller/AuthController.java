package com.example.demo.auth.controller;

import com.example.demo.auth.domain.*;
import com.example.demo.auth.service.MemberService;
import com.example.demo.auth.service.MemberServiceImpl;

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
public class AuthController {
    public void execute(Scanner scanner) {
        CalcDTO calc = new CalcDTO();
        GoogleDTO google = new GoogleDTO();
//        GradeDTO grade = new GradeDTO();

        MemberService service = new MemberServiceImpl();

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
                    BmiDTO b = BmiDTO.getInstance();
                    b.setName(scanner.next());
                    b.setTall(scanner.nextDouble());
                    b.setWeight(scanner.nextDouble());
                    result = service.getBmi(b);
                    break;
                case "2":
                    System.out.println(CalcDTO.CALC + "\n첫 번째 숫자 : \n연산자 (+, -, *, /, %) : \n두 번째 숫자 : ");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    result = service.getCalc(calc);
                    break;
                case "3":
                    System.out.println(GoogleDTO.GOOGLE_APP + "\nGoogle 검색 또는 URL 입력 : ");
                    google.setWord(scanner.next());
                    result = service.search(google);
                    break;
                case "4":
                    System.out.println("학생 수를 입력해주세요.");
                    int count = scanner.nextInt();
                    GradeDTO[] grades = new GradeDTO[count];
                    String[] results = new String[count];

                    for (int i = 0; i < grades.length; i++) {
                        grades[i] = GradeDTO.getInstance();
                        System.out.println(GradeDTO.GRADE_TITLE + "\n이름 : \n국어 : \n영어 : \n수학 : ");
                        grades[i].setName(scanner.next());
                        grades[i].setKor(scanner.nextInt());
                        grades[i].setEng(scanner.nextInt());
                        grades[i].setMath(scanner.nextInt());
                        results[i] = service.getGrade(grades[i]);
                    }
                    for (int i = 0; i < results.length; i++) {
                        System.out.println(results[i] + "\n");
                    }
                    break;
                case "5":
                    System.out.println(UserDTO.LOGIN_APP + "\n아이디 : \n비밀번호 : \n이름 : ");
                    UserDTO u = UserDTO.getInstance();
                    u.setId(scanner.next());
                    u.setPw(scanner.next());
                    u.setName(scanner.next());
                    result = service.login(u);
                    break;
                default:
                    result = "선택된 메뉴가 없습니다. 0~5 사이의 숫자를 입력해주세요.";
            }
            System.out.println(result);
        }
    }
}
