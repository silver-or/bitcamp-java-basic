package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName   : Feb08ServiceImpl
 * author     : 최은아
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-08    최은아       최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service{
    @Override
    public void lotto(Scanner scanner) {

    }

    @Override
    public void baseball(Scanner scanner) {
        int[] com = new int[3];
        int[] user = new int[3];
        int strike = 0;
        int ball = 0;
        int num = 0;
        String game = "Y";
        boolean duplicate;
        String s = "";
        for (int i = 0; i < 3; i++) {
            duplicate = true;
            while (duplicate) {
                num = (int)(Math.random() * 9) + 1;
                duplicate = false;
                for (int j = 0; j < i; j++) {
                    if (com[j] == num) {
                        duplicate = true;
                        break;
                    }
                }
            }
            com[i] = num;
        }

        while (game.equals("Y")) {
            strike = 0;
            ball = 0;
            s = "";

            for (int i = 0; i < 3; i++) {
                System.out.println((i + 1) + "번째 수를 입력하세요 : (1 ~ 9 사이의 수)");
                user[i] = scanner.nextInt();
            }

            if (user[0] == user[1] || user[0] == user[2] || user[1] == user[2]) {
                System.out.println("중복된 숫자는 입력할 수 없습니다.");
                continue;
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (com[i] == user[j]) {
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }

            for (int i = 0; i < 3; i++) {
                s += (i+1) + "번째 난수 : " + com[i] + "\t 사용자가 입력한 수 : " + user[i] + "\n";
            }

            if (strike == 3) {
                s += "홈런입니다.";
                break;
            } else if (strike == 0 && ball == 0) {
                s += "아웃입니다.";
            } else {
                s += "Strike : " + strike + ", Ball : " + ball + " 입니다.";
            }
            System.out.println(s);

            System.out.println("게임을 계속하시려면 'Y', 그만하시려면 'Y' 이외의 키를 입력해주세요.");
            game = scanner.next();
        }
    }

    @Override
    public void booking(Scanner scanner) {

    }

    @Override
    public void bank(Scanner scanner) {

    }

    @Override
    public void gugudan(Scanner scanner) {

    }
}
