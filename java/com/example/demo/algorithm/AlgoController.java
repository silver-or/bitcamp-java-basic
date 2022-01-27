package com.example.demo.algorithm;

import java.util.Scanner;

/**
 * packageName: com.example.demo.algorithm
 * fileName   : AlgoController
 * author     : 최은아
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-01-27       최은아       최초 생성
 */
public class AlgoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        Queue queue = new Queue();
        while (true) {
            System.out.println("[Menu] 0.Exit \n" +
                    "[심민혜] 1.Hash \t" +
                    "2.DP \n" +
                    "[권솔이] 3.Heap \t" +
                    "4.Brute Force \n" +
                    "[김지혜] 5.Sort \t" +
                    "6.Graph \n" +
                    "[하진희] 7.Greedy \t" +
                    "8.Bin Search \n" +
                    "[최은아] 9.Stack \t" +
                    "10.Queue \t" +
                    "11. DFS \t" +
                    "12. BFS \n");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit"); return;
                case "1" :
                    System.out.println(stack.solution(null));
                    break;
                case "2" :
                    System.out.println(queue.solution(0, 0,null));
                    break;
                default :
                    System.out.println("WRONG NUMBER");
            }
        }
    }
}
