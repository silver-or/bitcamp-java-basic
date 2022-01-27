package com.example.demo.calc;

/**
 * packageName: com.example.demo.calc
 * fileName   : CalcApp.java
 * author     : 최은아
 * date       : 2022-01-24
 * desc       : 숫자 2개와 연산자 1개를 받아서 계산하는 계산기 앱
 * ================================
 * DATE             AUTHOR        NOTE
 * ================================
 * 2022-01-24       최은아       최초 생성
 */

public class CalcApp {
    public static String CALC = "계산기";
    private int num1 = 0;
    private String opcode = "";
    private int num2 = 0;

    public String calc(int num1, String opcode, int num2) {
        this.num1 = num1;
        this.opcode = opcode;
        this.num2 = num2;
        int result = 0;
/*
        // if() {}
        if (opcode.equals("+")) { result = num1 + num2; }
        else if (opcode.equals("-")) { result = num1 - num2; }
        else if (opcode.equals("*")) { result = num1 * num2; }
        else if (opcode.equals("/")) { result = num1 / num2; }
        else if (opcode.equals("%")) { result = num1 % num2; }
        else { return "잘못된 연산자입니다."; }
*/
        // switch() {}
        switch(opcode) {
            case "+" : result = num1 + num2; break;
            case "-" : result = num1 - num2; break;
            case "*" : result = num1 * num2; break;
            case "/" : result = num1 / num2; break;
            case "%" : result = num1 % num2; break;
            default : return "잘못된 연산자입니다.";
        }
        String text = String.format("%d %s %d = %d", this.num1, opcode, this.num2, result);
        return text;
    }
}
