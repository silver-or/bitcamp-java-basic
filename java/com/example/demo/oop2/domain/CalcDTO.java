package com.example.demo.oop2.domain;

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

public class CalcDTO {
    public static String CALC = "계산기";
    private int num1 = 0;
    private String opcode = "";
    private int num2 = 0;

    protected String kind;
    protected String company;
    protected String move;

    public CalcDTO(String kind, String company, String move) {
        this.kind = kind;
        this.company = company;
        this.move = move;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public String getOpcode() {
        return opcode;
    }

    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getKind() {
        return kind;
    }

    public String getCompany() {
        return company;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }
}
