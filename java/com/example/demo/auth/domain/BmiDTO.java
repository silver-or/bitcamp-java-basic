package com.example.demo.auth.domain;

/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiApp
 * author     : 최은아
 * date       : 2022-01-25
 * desc       : bmi 지수를 계산해주는 앱
 * variable   : [클래스 변수] BMI_APP
 * [인스턴스 변수] name, height, weight
 * [지역 변수] result
 * [매개변수] name, height, weight
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-01-25    최은아       최초 생성
 */
public class BmiDTO {
    public static String BMI_APP = "BMI";
    private String name;
    private double tall;
    private double weight;

    public String getName() { // getter (read only)
        return name;
    }

    public void setName(String name) { // setter (write only)
        this.name = name;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
