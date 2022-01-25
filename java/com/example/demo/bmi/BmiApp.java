package com.example.demo.bmi;

/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiApp
 * author     : 최은아
 * date       : 2022-01-25
 * desc       : bmi 지수를 계산해주는 앱
 * variable   : [클래스 변수] BMI_APP
 *              [인스턴스 변수] name, height, weight
 *              [지역 변수] result
 *              [매개변수] name, height, weight
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-01-25    최은아       최초 생성
 */
public class BmiApp {
    public static String BMI_APP = "BMI";
    private String name;
    private double height;
    private double weight;

    public String getBMI(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        String result = String.format("%s님의 키 : %.2f 몸무게 : %.2f, bmi 지수는 정상입니다.", name, height, weight);
        return result;
    }
}
