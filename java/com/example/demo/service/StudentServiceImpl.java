package com.example.demo.service;

import com.example.demo.domain.*;

/**
 * packageName: com.example.demo.service
 * fileName   : StudentServiceImpl
 * author     : 최은아
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-07    최은아       최초 생성
 */
public class StudentServiceImpl implements StudentService {
    @Override
    public String getBmi(BmiDTO bmi) {
        return String.format("%s님의 키 : %.2f 몸무게 : %.2f, bmi 지수는 정상입니다.", bmi.getName(), bmi.getHeight(), bmi.getWeight());
    }

    @Override
    public String getCalc(CalcDTO calc) {
        int result = 0;
        switch (calc.getOpcode()) {
            case "+":
                result = calc.getNum1() + calc.getNum2();
                break;
            case "-":
                result = calc.getNum1() - calc.getNum2();
                break;
            case "*":
                result = calc.getNum1() * calc.getNum2();
                break;
            case "/":
                result = calc.getNum1() / calc.getNum2();
                break;
            case "%":
                result = calc.getNum1() % calc.getNum2();
                break;
            default:
                return "잘못된 연산자입니다.";
        }
        return String.format("%d %s %d = %d", calc.getNum1(), calc.getOpcode(), calc.getNum2(), result);
    }

    @Override
    public String search(GoogleDTO google) {
        return String.format("\'%s\'을(를) 검색한 결과입니다.", google.getWord());
    }

    @Override
    public String getGrade(GradeDTO grade) {
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total / 3;
        String pass = (avg >= 60) ? "합격" : "불합격";
        return String.format("   * ########## %s ######## \n" +
                        "   * 이름: %s\n" +
                        "   * > 국어: %d점 \n" +
                        "   * > 영어: %d점 \n" +
                        "   * > 수학: %d점 \n" +
                        "   * 총점: %d점 \n" +
                        "   * 평균(정수): %d점 \n" +
                        "   * 합격여부: %s \n" +
                        "   * #######################",
                GradeDTO.GRADE_TITLE, grade.getName(), grade.getKor(), grade.getEng(), grade.getMath(), total, avg, pass);
    }

    @Override
    public String login(LoginDTO login) {
        return (login.getPw().equals(LoginDTO.PASSWORD)) ? String.format("%s 님의 비번은 %s 가 맞습니다. 로그인 성공", login.getName(), login.getPw())
                : String.format("%s 님의 ID는 맞고, 비번은 %s 가 아닙니다. 로그인 실패", login.getId(), login.getPw());
    }
}
