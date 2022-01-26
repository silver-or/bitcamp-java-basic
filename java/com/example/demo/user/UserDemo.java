package com.example.demo.user;

import java.util.Scanner;

/**
 * packageName: com.example.demo.user
 * fileName   : UserDemo
 * author     : 최은아
 * date       : 2022-01-26
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-01-26       최은아       최초 생성
 */
public class UserDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserApp userApp = new UserApp();
        String result = userApp.getUser();
        System.out.println(result);
    }
}
