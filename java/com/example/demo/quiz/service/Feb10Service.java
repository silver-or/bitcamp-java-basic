package com.example.demo.quiz.service;

/**
 * packageName: com.example.demo.quiz.service
 * fileName   : Feb10Service
 * author     : 최은아
 * date       : 2022-02-10
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-10    최은아       최초 생성
 */
public interface Feb10Service {
    // 아래 문제들은 모두 스캐너 없이, Math 랜덤으로 처리합니다.
    // 1인
    void bubbleSort();
    void insertionSort();
    void selectionSort();
    // 1인
    int[] quickSort(int[] array, int m, int n);
    void mergeSort();
    // 1인
    void magicSquare();
    // 1인
    void zigzag();
    // 1인
    // 좌측 90도 직각삼각형 별 찍기
    void rectangleStarPrint();
    // 정삼각형 별 찍기
    void triangleStarPrint();
}
