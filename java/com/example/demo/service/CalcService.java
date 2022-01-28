package com.example.demo.service;

import com.example.demo.domain.CalcDTO;

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
public class CalcService {
    public String execute(CalcDTO calc) {
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
}
