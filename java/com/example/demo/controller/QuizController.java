package com.example.demo.controller;

import com.example.demo.service.QuizService;
import com.example.demo.service.QuizServiceImpl;

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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuizService service = new QuizServiceImpl();
        String[] arr = {"김지혜", "최은아", "심민혜", "권솔이", "하진희",
                        "Sort", "Stack", "Hash", "Heap", "Greedy",
                        "DFS", "Queue", "DP", "Brute Force", "Bin Search",
                        "BFS", "Graph"};
        while (true) {
            System.out.println("\n[MENU] \n" +
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
                    service.quiz1(arr);
                    break;
                case "2" :
                    service.quiz2(arr);
                    break;
                case "3" :
                    service.quiz3(arr);
                    break;
                case "4" :
                    service.quiz4(arr);
                    break;
                default:
                    System.out.println("0~4 사이의 숫자를 입력해주세요.");
                    break;
            }
        }
    }
}
