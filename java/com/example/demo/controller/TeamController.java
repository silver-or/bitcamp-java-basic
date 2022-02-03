package com.example.demo.controller;

import com.example.demo.domain.TeamDTO;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : ArrayController
 * author     : 최은아
 * date       : 2022-02-03
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-03       최은아       최초 생성
 */
public class TeamController {
    public static void main(String[] args) {
        TeamDTO[] team = new TeamDTO[5];
        String[] names =    {"심민혜", "권솔이", "김지혜", "하진희", "최은아"};
        String[] subjects = {"Hash", "Heap", "Sort", "Greedy", "Stack",
                             "DP", "Brute Force", "DFS", "Bin Search", "Queue",
                             "", "", "BFS", "", "Graph"};
/*
        String[] names =    {"김지혜", "최은아", "심민혜", "권솔이", "하진희"};
        String[] subjects = {"Sort", "Stack", "Hash", "Heap", "Greedy",
                             "DFS", "Queue", "DP", "Brute Force", "Bin Search",
                             "BFS", "Graph", "", "", ""};
*/

        for (int i = 0; i < team.length; i++) {
            team[i] = new TeamDTO();
            team[i].setName(names[i]);
            team[i].setSubject1(subjects[i]);
            team[i].setSubject2(subjects[i+5]);
            team[i].setSubject3(subjects[i+10]);
        }

        for (int i = 0; i < team.length; i++) {
            System.out.print(team[i].getName() + " : " + team[i].getSubject1() + ", " + team[i].getSubject2());
            if (team[i].getSubject3().equals("")) {
                System.out.println();
                continue;
            }
            System.out.println(", " + team[i].getSubject3());
        }
    }
}
