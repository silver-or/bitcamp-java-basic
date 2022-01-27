package com.example.demo.bmi;

import java.util.Scanner;

/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiDemo
 * author     : 최은아
 * date       : 2022-01-25
 * desc       : BmiApp을 실행하는 컨트롤러
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-01-25    최은아       최초 생성
 */
public class BmiDemo {
    public String execute(String name, double height, double weight) {
        BmiApp bmiApp = new BmiApp();
        return bmiApp.getBMI(name, height, weight);
    }
}
