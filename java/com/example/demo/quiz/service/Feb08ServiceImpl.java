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
        /**
         * 사용되는 숫자는 1에서 9까지 서로 다른 숫자이다.
         * 숫자는 맞지만 위치가 틀렸을 때는 볼.
         * 숫자와 위치가 전부 맞으면 스트라이크.
         * 숫자와 위치가 전부 틀리면 아웃.
         * 무엇이 볼이고 스트라이크인지는 알려주지 않는다.
         * 두 숫자가 중복되면 경우의 수가 많아지므로 중복 숫자는 사용하지 않는다.
         * */
        int[] com = new int[3];
        int[] user = new int[3];
        int strike = 0;
        int ball = 0;
        int num = 0;
        boolean duplicate; // 컴퓨터 난수의 중복 여부 확인
        String s = "";
        // 컴퓨터 난수 생성
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

        for (int chance = 1; chance <= 5; chance++) {
            strike = 0;
            ball = 0;
            s = "";

            if (chance == 5) {
                System.out.println("마지막 도전입니다.");
            } else {
                System.out.println(chance + "번째 도전입니다.");
            }

            for (int i = 0; i < 3; i++) {
                System.out.println((i + 1) + "번째 수를 입력하세요 : (1 ~ 9 사이의 수) *단, 중복은 허용하지 않습니다.*");
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

            if (strike == 3) {
                System.out.println("정답입니다! 게임을 종료합니다.");
                break;
            } else if (strike == 0 && ball == 0) {
                s += "아웃입니다.";
            } else {
                s += strike + "S " + ball + "B 입니다.";
            }
            System.out.println(s);

            if (chance == 5) {
                String answer = "아쉬워요. 정답은 ";
                for (int i = 0; i < com.length; i++) {
                    answer += com[i] + " ";
                }
                answer += "입니다.";
                System.out.println(answer);
            }
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
        System.out.println("단을 입력해주세요 : ");
        int dan = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "*" + i + "=" + dan*i);
        }
    }
}
