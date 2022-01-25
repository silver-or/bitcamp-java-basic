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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiApp bmiApp = new BmiApp();

        System.out.println(BmiApp.BMI_APP);

        System.out.print("이름 : ");
        String name = scanner.next();

        System.out.print("키 : ");
        double height = scanner.nextDouble();

        System.out.print("몸무게 : ");
        double weight = scanner.nextDouble();

        String result = bmiApp.getBMI(name, height, weight);
        System.out.println(result);
    }
}
