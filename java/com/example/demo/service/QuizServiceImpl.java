package com.example.demo.service;

/**
 * packageName: com.example.demo.service
 * fileName   : QuizService
 * author     : 최은아
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-07    최은아       최초 생성
 */
public class QuizServiceImpl implements QuizService {
    @Override
    public void quiz1(String[] arr) {
        System.out.println("Q1. 팀별 과제를 출력하세요.");
        String s = ""; // Assignment (할당), 오버라이딩
        for (int i = 0; i < arr.length; i++) {
            if ((i % 5) == 0) {
                s += "\n";
            }
            s += i + " : " + arr[i] + "\t "; // 오버로딩
        }
        System.out.println(s);
    }

    @Override
    public void quiz2(String[] arr) {
        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요. 예) 김지혜, Sort, DFS, BFS");
        String s = "";
        String name = "김지혜";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(name)) {
                for (int j = 0; j < 4; j++) {
                    s += arr[i + j * 5];
                    if (j < 3) {
                        s += ", ";
                    }
                }
            }
        }
        System.out.println(s);
    }

    @Override
    public void quiz3(String[] arr) {
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 최은아");
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Queue")) {
                s = arr[i] + "를 담당한 사람 : " + arr[i % 5];
            }
        }
        System.out.println(s);

        System.out.println("-----------------------------");

        System.out.println("Q3-1. 입력한 과목의 인덱스를 추출하세요.");
        s = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Greedy")) {
                s = arr[i] + "의 인덱스 값 : " + i;
            }
        }
        System.out.println(s);
    }

    @Override
    public void quiz4(String[] arr) {
        System.out.println("Q4. 팀원별 과제 수를 출력하세요. 예) 김지혜(3개), 최은아(3개), 심민혜(2개), 권솔이(2개), 하진희(2개)");
        int[] count = new int[5];
//      String[] countManager = new String[5];
        String s = "";
        for (int i = 0; i < arr.length; i++) {
/*
            switch(arr[i]) {
                case "김지혜" : countManager[0] = arr[i]; break;
                case "최은아" : countManager[1] = arr[i]; break;
                case "심민혜" : countManager[2] = arr[i]; break;
                case "권솔이" : countManager[3] = arr[i]; break;
                case "하진희" : countManager[4] = arr[i]; break;
            }
*/
/*
            if (i > 4) {
                switch (i % 5) {
                    case 0 : count[0]++; break;
                    case 1 : count[1]++; break;
                    case 2 : count[2]++; break;
                    case 3 : count[3]++; break;
                    case 4 : count[4]++; break;
                }
            }
*/
            if (i > 4) {
                for (int j = 0; j < 5; j++) {
                    if (i % 5 == j) {
                        count[j]++;
                    }
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            s += arr[i] + "(" + count[i] + "개)";
            if (i < 4) {
                s += ", ";
            }
        }
        System.out.println(s);
    }
}
