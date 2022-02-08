package com.example.demo.algorithm.controller;

import com.example.demo.algorithm.service.*;

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
 * 2022-01-27    최은아       최초 생성
 */
public class AlgorithmController {
    public void execute(Scanner scanner) {
        StackService stackService = new StackServiceImpl();
        QueueService queueService = new QueueServiceImpl();
        GraphService graphService = new GraphServiceImpl();
        while (true) {
            System.out.println("[Menu] 0.Exit \n" +
                    "[심민혜] 1.Hash \t" +
                    "2.DP \n" +
                    "[권솔이] 3.Heap \t" +
                    "4.Brute Force \n" +
                    "[김지혜] 5.Sort \t" +
                    "6.DFS \t" +
                    "7. BFS \n" +
                    "[하진희] 8.Greedy \t" +
                    "9.Bin Search \n" +
                    "[최은아] 10.Stack \t" +
                    "11.Queue \t" +
                    "12. Graph \n");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit"); return;
                case "1" :
                    break;
                case "2" :
                    break;
                case "10" :
                    stackService.stockPrice(null);
                    break;
                case "11" :
                    queueService.functionDevelopment(null, null);
                    queueService.printer(null, 0);
                    queueService.truck(0, 0, null);
                    break;
                case "12" :
                    graphService.farthestNode(0, null);
                    graphService.ranking(0, null);
                    graphService.numOfRooms(null);
                    break;
                default :
                    System.out.println("WRONG NUMBER");
            }
        }
    }
}
