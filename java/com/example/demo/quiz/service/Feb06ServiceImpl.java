package com.example.demo.quiz.service;

/**
 * packageName: com.example.demo.service
 * fileName   : Feb06Service
 * author     : 최은아
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-07    최은아       최초 생성
 */
public class Feb06ServiceImpl implements Feb06Service {
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
        String s = "";
        for (int i = 5; i < arr.length; i++) {
            int a = i % 5;
            for (int j = 0; j < 5; j++) {
                if (a == j) {
                    count[j]++;
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
/*
        // 500 * 5 의 열 count 세기
        s = "";
        String[] array = new String[2500];
        int[] countArray = new int[5];

        for (int i = 0; i < 5; i++) {
            array[i] = i +"열";
        }

        for (int i = 5; i < array.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 5 == j) {
                    countArray[j]++;
                }
            }
        }
        for (int i = 0; i < countArray.length; i++) {
            s += array[i] + "의 count : " + countArray[i] + "\n";
        }
        System.out.println(s);
*/
    }
}
