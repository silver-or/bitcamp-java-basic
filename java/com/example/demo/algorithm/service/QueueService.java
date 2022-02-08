package com.example.demo.algorithm.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.algorithm.service
 * fileName   : QueueService
 * author     : 최은아
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-08    최은아       최초 생성
 */
public interface QueueService {
    int[] functionDevelopment(int[] progresses, int[] speeds);
    int printer(int[] priorities, int location);
    int truck(int bridge_length, int weight, int[] truck_weights);
}
