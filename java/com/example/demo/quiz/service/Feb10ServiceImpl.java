package com.example.demo.quiz.service;

/**
 * packageName: com.example.demo.quiz.service
 * fileName   : Feb10ServiceImpl
 * author     : 최은아
 * date       : 2022-02-10
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-10    최은아       최초 생성
 */
public class Feb10ServiceImpl implements Feb10Service{
    @Override
    public void bubbleSort() {

    }

    @Override
    public void insertionSort() {

    }

    @Override
    public void selectionSort() {

    }

    @Override
    public void quickSort() {

    }

    @Override
    public void mergeSort() {

    }

    @Override
    public void magicSquare() {
        /**
         * 홀수 마방진 구하기
         * 1. 시작은 첫 행, 한 가운데 열에 1을 둔다.
         * 2. 행을 감소, 열을 증가하면서 순차적으로 수를 넣어간다.
         * 3. 행은 감소하므로 첫 행보다 작아지는 경우에는 마지막 행으로 넘어간다.
         * 4. 열은 증가하므로 마지막 열보다 커지는 경우에는 첫 열로 넘어간다.
         * 5. 넣은 수가 n의 배수이면 행만 증가한다. 열은 변화가 없다.
         * */
        int num;
        while (true) {
            num = (int)(Math.random() * 9) + 1;
            if (num % 2 == 1 && num != 1) {
                break;
            }
        }

        int array[][] = new int[num][num];
        int row, col;
        int cnt;
        row = 0;
        col = num / 2; // 마방진은 1행 가운데 열에서부터 시작

        for (int i = 1; i <= num * num; i++) {
            array[row][col] = i;
            if (i % num == 0) {
                row++;
                if (row == num) {
                    row = 0;
                }
            } else {
                row--;
                col++;
                if (row == -1) {
                    row = num - 1;
                }
                if (col == num) {
                    col = 0;
                }
            }
        }
        for (row = 0; row < num; row++) {
            for (col = 0; col < num; col++) {
                System.out.printf("%3d", array[row][col]);
            }
            System.out.println();
        }

    }

    @Override
    public void zigzag() {

    }

    @Override
    public void rectangleStarPrint() {

    }

    @Override
    public void triangleStarPrint() {

    }
}
