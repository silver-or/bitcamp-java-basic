package com.example.demo.auth.service;

import com.example.demo.auth.domain.*;

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
public class MemberServiceImpl implements MemberService {

    /**
     * BMI = w / t * t
     * 고도 비만 : 35 이상
     * 중(重)도 비만 (2단계 비만) : 30 - 34.9
     * 경도 비만 (1단계 비만) : 25 - 29.9
     * 과체중 : 23 - 24.9
     * 정상 : 18.5 - 22.9
     * 저체중 : 18.5 미만
     * */
    @Override
    public String getBmi(BmiDTO param) {
        String result;
        double bmi = param.getWeight() / (param.getTall() * param.getTall()) * 10000;
        if (bmi >= 35) {
            result = "고도 비만";
        } else if (bmi >= 30) {
            result = "중(重)도 비만 (2단계 비만)";
        } else if (bmi >= 25) {
            result = "경도 비만 (1단계 비만)";
        } else if (bmi >= 23) {
            result = "과체중";
        } else if (bmi >= 18.5) {
            result = "정상";
        } else {
            result = "저체중";
        }

        return String.format("%s님의 키 : %.2f 몸무게 : %.2f\nbmi 지수는 %.2f로, %s입니다.", param.getName(), param.getTall(), param.getWeight(), bmi, result);
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
    public String login(UserDTO login) {
        return (login.getPw().equals(UserDTO.PASSWORD)) ? String.format("%s 님의 비번은 %s 가 맞습니다. 로그인 성공", login.getName(), login.getPw())
                : String.format("%s 님의 ID는 맞고, 비번은 %s 가 아닙니다. 로그인 실패", login.getId(), login.getPw());
    }
}
