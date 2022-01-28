package com.example.demo.service;

import com.example.demo.domain.BmiDTO;

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
public class BmiService {
    public String getBMI(BmiDTO bmi) {
        // Algorithm
        return String.format("%s님의 키 : %.2f 몸무게 : %.2f, bmi 지수는 정상입니다.", bmi.getName(), bmi.getHeight(), bmi.getWeight());
    }
}
