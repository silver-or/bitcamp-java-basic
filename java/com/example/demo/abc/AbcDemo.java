package com.example.demo.abc;

import java.util.Scanner;

/**
 * packageName: com.example.demo.abc
 * fileName   : AbcDemo
 * author     : 최은아
 * date       : 2022-01-26
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-01-26       최은아       최초 생성
 */
public class AbcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbcApp abcApp = new AbcApp();
        String result = abcApp.getAbc();
        System.out.println(result);
    }
}
