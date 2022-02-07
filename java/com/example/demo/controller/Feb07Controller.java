package com.example.demo.controller;

import com.example.demo.service.Feb07Service;
import com.example.demo.service.Feb07ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : Feb07Controller
 * author     : 최은아
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-07    최은아       최초 생성
 */
public class Feb07Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Feb07Service service = new Feb07ServiceImpl();
        while (true) {
            System.out.println("\n[MENU] \n" +
                    "0.EXIT \n" +
                    "1. 주사위(dice) \n" +
                    "2. 가위바위보 (rps) \n" +
                    "3. 입력받은 두 수 사이의 소수 구하기 (getPrime) \n" +
                    "4. 자바로 입력받은 연도가 윤년인지 평년인지 판단하기 (leapYear) \n" +
                    "5. 임의로 입력받은 숫자 맞추기(numberGolf) \n");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit");
                    return;
                case "1" :
                    System.out.println("첫 번째 주사위 : \n두 번째 주사위 : \n세 번째 주사위 : ");
                    service.dice(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    break;
                case "2" :
                    service.rps(scanner.nextInt());
                    break;
                case "3":
                    System.out.println("1 이상의 두 수를 입력해주세요.");
                    service.getPrime(scanner.nextInt(), scanner.nextInt());
                    break;
                case "4" :
                    System.out.println("연도를 입력해주세요.");
                    service.leapYear(scanner.nextInt());
                    break;
                case "5" :
                    service.numberGolf();
                    break;
                default :
                    System.out.println("0~5 사이의 숫자를 입력해주세요.");
                    break;
            }
        }
    }
}
