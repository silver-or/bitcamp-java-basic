package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.*;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : TeamController2
 * author     : 최은아
 * date       : 2022-02-04
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-04    최은아       최초 생성
 */
public class QuizController {
    public void execute(Scanner scanner) {
        Feb06Service feb06Service = new Feb06ServiceImpl();
        Feb07Service feb07Service = new Feb07ServiceImpl();
        Feb08Service feb08Service = new Feb08ServiceImpl();
        Feb10Service feb10Service = new Feb10ServiceImpl();
        while (true) {
            System.out.println("\n[서브 메뉴]\n" +
                                "0. EXIT\n" +
                                "1. 2월 6일\n" +
                                "2. 2월 7일\n" +
                                "3. 2월 8일\n" +
                                "4. 2월 10일");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit");
                    return;
                case "1" :
                    String[] arr = {"김지혜", "최은아", "심민혜", "권솔이", "하진희",
                            "Sort", "Stack", "Hash", "Heap", "Greedy",
                            "DFS", "Queue", "DP", "Brute Force", "Bin Search",
                            "BFS", "Graph"};
                    System.out.println("\n[소메뉴] \n" +
                                        "0.EXIT \n" +
                                        "1.팀별 과제를 출력하기 \n" +
                                        "2.팀장이 맡은 과제만 출력하기 \n" +
                                        "3.큐를 담당한 사람을 출력하기 \n" +
                                        "4.팀원별 과제 수 출력하기 \n");
                    switch (scanner.next()) {
                        case "0" :
                            System.out.println("Exit");
                            return;
                        case "1" :
                            System.out.println("### 1. 팀별 과제 출력 ###");
                            feb06Service.quiz1(arr);
                            break;
                        case "2" :
                            System.out.println("### 2. 팀장이 맡은 과제 출력 ###");
                            feb06Service.quiz2(arr);
                            break;
                        case "3" :
                            System.out.println("### 3. 큐를 담당한 사람을 출력 ###");
                            feb06Service.quiz3(arr);
                            break;
                        case "4" :
                            System.out.println("### 4. 팀원별 과제 수 출력 ###");
                            feb06Service.quiz4(arr);
                            break;
                        default :
                            System.out.println("0~4 사이의 숫자를 입력해주세요.");
                            break;
                    }
                    break;
                case "2" :
                    System.out.println("\n[소메뉴] \n" +
                            "0. EXIT \n" +
                            "1. 주사위(dice) \n" +
                            "2. 가위바위보 (rps) \n" +
                            "3. 입력받은 두 수 사이의 소수 구하기 (getPrime) \n" +
                            "4. 자바로 입력받은 연도가 윤년인지 평년인지 판단하기 (leapYear) \n" +
                            "5. 임의로 입력받은 숫자 맞추기(numberGolf)");
                    switch (scanner.next()) {
                        case "0" :
                            System.out.println("### 종료 ###");
                            return;
                        case "1" :
                            System.out.println("### 1. 주사위 (dice) ###");
                            feb07Service.dice(scanner);
                            break;
                        case "2" :
                            System.out.println("### 2. 가위바위보 (rps) ###");
                            feb07Service.rps(scanner);
                            break;
                        case "3":
                            System.out.println("### 3. 입력받은 두 수 사이의 소수 구하기 (getPrime) ###");
                            feb07Service.getPrime(scanner);
                            break;
                        case "4" :
                            System.out.println("### 4. 자바로 입력받은 연도가 윤년인지 평년인지 판단하기 (leapYear) ###");
                            feb07Service.leapYear(scanner) ;
                            break;
                        case "5" :
                            System.out.println("### 5. 임의로 입력받은 숫자 맞추기(numberGolf) ###");
                            feb07Service.numberGolf();
                            break;
                        default :
                            System.out.println("0~5 사이의 숫자를 입력해주세요.");
                            break;
                    }
                    break;
                case "3" :
                    System.out.println("\n[소메뉴] \n" +
                            "0. EXIT \n" +
                            "1. 로또 \n" +
                            "2. 야구 \n" +
                            "3. 좌석 예약 \n" +
                            "4. 은행 입출금 \n" +
                            "5. 구구단");
                    switch (scanner.next()) {
                        case "0" :
                            System.out.println("### 종료 ###");
                            return;
                        case "1" :
                            System.out.println("### 1. 로또 ###");
                            feb08Service.lotto(scanner);
                            break;
                        case "2" :
                            System.out.println("### 2. 야구 ###");
                            feb08Service.baseball(scanner);
                            break;
                        case "3":
                            System.out.println("### 3. 좌석 예약 ###");
                            feb08Service.booking(scanner);
                            break;
                        case "4" :
                            System.out.println("### 4. 은행 입출금 ###");
                            feb08Service.bank(scanner); ;
                            break;
                        case "5" :
                            System.out.println("### 5. 구구단 ###");
                            feb08Service.gugudan(scanner);
                            break;
                        default :
                            System.out.println("0~5 사이의 숫자를 입력해주세요.");
                            break;
                    }
                    break;
                case "4" :
                    System.out.println("\n[소메뉴] \n" +
                            "0. EXIT \n" +
                            "1. bubbleSort \n" +
                            "2. insertionSort \n" +
                            "3. selectionSort \n" +
                            "4. quickSort \n" +
                            "5. mergeSort \n" +
                            "6. magicSquare \n" +
                            "7. zigzag \n" +
                            "8. rectangleStarPrint \n" +
                            "9. triangleStarPrint");
                    switch (scanner.next()) {
                        case "0" :
                            System.out.println("### 종료 ###");
                            return;
                        case "1" :
                            System.out.println("### 1. bubbleSort ###");
                            feb10Service.bubbleSort();
                            break;
                        case "2" :
                            System.out.println("### 2. insertionSort ###");
                            feb10Service.insertionSort();
                            break;
                        case "3":
                            System.out.println("### 3. selectionSort ###");
                            feb10Service.selectionSort();
                            break;
                        case "4" :
                            System.out.println("### 4. quickSort ###");
                            boolean duplicate;
                            int num = 0;
                            int[] array = new int[10];
                            for (int i = 0 ; i < array.length; i++) {
                                duplicate = true;
                                while (duplicate) {
                                    num = (int)(Math.random() * 100) + 1;
                                    duplicate = false;
                                    for (int j = 0; j < i; j++) {
                                        if (array[j] == num) {
                                            duplicate = true;
                                            break;
                                        }
                                    }
                                }
                                array[i] = num;
                            }
                            System.out.print("퀵 정렬 전 데이터 : ");
                            for (int i = 0; i < array.length; i++) {
                                System.out.print(array[i] + " ");
                            }
                            System.out.println();
                            array = feb10Service.quickSort(array, 0, array.length - 1);
                            System.out.print("퀵 정렬 후 데이터 : ");
                            for (int i = 0; i < array.length; i++) {
                                System.out.print(array[i] + " ");
                            }
                            break;
                        case "5" :
                            System.out.println("### 5. mergeSort ###");
                            feb10Service.mergeSort();
                            break;
                        case "6" :
                            System.out.println("### 6. magicSquare ###");
                            feb10Service.magicSquare();
                            break;
                        case "7" :
                            System.out.println("### 7. zigzag ###");
                            feb10Service.zigzag();
                        case "8" :
                            System.out.println("### 8. rectangleStarPrint ###");
                            feb10Service.rectangleStarPrint();
                            break;
                        case "9" :
                            System.out.println("### 9. triangleStarPrint ###");
                            feb10Service.triangleStarPrint();
                            break;
                        default :
                            System.out.println("0~5 사이의 숫자를 입력해주세요.");
                            break;
                    }
                    break;
                default : System.out.println("올바른 범위 내의 숫자를 입력해주세요."); break;
            }
        }
    }
}
