package com.example.demo.controller;

/**
 * packageName: com.example.demo.controller
 * fileName   : TeamController2
 * author     : 최은아
 * date       : 2022-02-04
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-04       최은아       최초 생성
 */
public class TeamController2 {
    public static void main(String[] args) {
        String[] arr = {"김지혜", "최은아", "심민혜", "권솔이", "하진희",
                        "Sort", "Stack", "Hash", "Heap", "Greedy",
                        "DFS", "Queue", "DP", "Brute Force", "Bin Search",
                        "BFS", "Graph", "", "", ""};
        String s = ""; // Assignment (할당), 오버라이딩
        for (int i = 0; i < arr.length; i++) {
            if (i == 17) break;
            s += i + " : " + arr[i] + "\t"; // 오버로딩
            if ((i % 5) == 4) {
                s += "\n";
            }
        }
        System.out.println(s);
    }
}
