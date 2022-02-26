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
    /*
    * author : 하진희
    * */
    @Override
    public void bubbleSort() {
        boolean duplicate;
        int num = 0;
        int temp;
        int[] array = new int[10];
        for (int i = 0 ; i < array.length; i++) {
            duplicate = true;
            while (duplicate) {
                num = (int)(Math.random() * 100) + 1;
                duplicate = false;
                for (int j = 0; j < i; j++) {
                    if (array[j] == num) {
                        duplicate = true;
                        break;
                    }
                }
            }
            array[i] = num;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    @Override
    public void insertionSort() {

    }

    @Override
    public void selectionSort() {

    }
    /*
     * author : 김지혜
     * */
    @Override
    public int[] quickSort(int[] array, int m, int n) {
        // pivot의 인덱스는 m, 배열의 마지막 인덱스는 n
        int i, j, temp;
        if (m < n) {
            i = m;
            j = n + 1;
            do {
                do {
                    i++;
                } while (i <= n && array[i] < array[m]); // 왼쪽에서 오른쪽으로 가면서 pivot보다 큰 것을 검색
                do {
                    j--;
                } while (j > m && array[j] > array[m]); // 오른쪽에서 왼쪽으로 가면서 pivot보다 작은 것을 검색
                if (i < j) { // 큰 값과 작은 값 교환
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            } while (i < j);
            // 데이터가 엇갈릴 경우 array[j]에 pivot보다 작은 값이 들어있으므로 array[j]와 pivot(array[m])의 값을 교환
            temp = array[j];
            array[j] = array[m];
            array[m] = temp;
            // pivot을 기준으로 왼쪽과 오른쪽 부분 리스트로 나누어 위 과정을 반복
            quickSort(array, m, j-1);
            quickSort(array, j+1, n);
        }
        return array;
    }

    @Override
    public void mergeSort() {

    }
    /*
     * author : 최은아
     * */
    @Override
    public void magicSquare() {
        /**
         * 홀수 마방진 구하기
         * 1. 시작은 첫 행, 한 가운데 열에 1을 둔다.
         * 2. 행을 감소, 열을 증가하면서 순차적으로 수를 넣어간다.
         * 3. 행은 감소하므로 첫 행보다 작아지는 경우에는 마지막 행으로 넘어간다.
         * 4. 열은 증가하므로 마지막 열보다 커지는 경우에는 첫 열로 넘어간다.
         * 5. 넣은 수가 n의 배수이면 행만 증가한다. 열은 변화가 없다.
         * 참고) https://cbts.tistory.com/65
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
    /*
     * author : 심민혜
     * */
    @Override
    public void zigzag() {

    }
    /*
     * author : 권솔이
     * */
    @Override
    public void rectangleStarPrint() {

    }

    @Override
    public void triangleStarPrint() {

    }
}
