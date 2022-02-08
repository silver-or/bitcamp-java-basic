package com.example.demo.algorithm.service;

/**
 * packageName: com.example.demo.algorithm.service
 * fileName   : GraphService
 * author     : 최은아
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-08    최은아       최초 생성
 */
public interface GraphService {
    int farthestNode(int n, int[][] edge);
    int ranking(int n, int[][] results);
    int numOfRooms (int[] arrows);
}
