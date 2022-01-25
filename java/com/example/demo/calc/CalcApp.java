package com.example.demo.calc;

/*
* 숫자 2개와 연산자 1개를 받아서 계산하는 계산기를 코딩하시오.
* */

public class CalcApp {
    static String CALC = "계산기";
    private int num1 = 0;
    private int num2 = 0;
    private String opcode = "";

    public String calc(int num1, String opcode, int num2) {
        this.num1 = num1;
        this.opcode = opcode;
        this.num2 = num2;

        if (opcode.equals("+")) { return String.format("%d %s %d = %d", this.num1, opcode, this.num2, this.num1 + this.num2); }
        else if (opcode.equals("-")) { return String.format("%d %s %d = %d", this.num1, opcode, this.num2, this.num1 - this.num2); }
        else if (opcode.equals("*")) { return String.format("%d %s %d = %d", this.num1, opcode, this.num2, this.num1 * this.num2); }
        else if (opcode.equals("/")) { return String.format("%d %s %d = %d", this.num1, opcode, this.num2, this.num1 / this.num2); }
        else if (opcode.equals("%")) { return String.format("%d %s %d = %d", this.num1, opcode, this.num2, this.num1 % this.num2); }
        else { return "잘못된 연산자입니다."; }
    }
}
