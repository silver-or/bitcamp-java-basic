package com.example.demo.controller;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController2
 * author     : 최은아
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-01-27       최은아       최초 생성
 */
public class DemoController2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("[MENU] 0.Exit");
            String select = scanner.next();
            switch (select) {
                case "0" :
                    System.out.println("Exit"); return;
                case "1" : break;
                default :
                    System.out.println("WRONG MENU");
            }
        }
    }
}
