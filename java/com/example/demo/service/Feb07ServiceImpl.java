package com.example.demo.service;

/**
 * packageName: com.example.demo.service
 * fileName   : Feb07ServiceImpl
 * author     : 최은아
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-07    최은아       최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service {
    @Override
    public void dice(int num) {

    }

    @Override
    public void rps(int num) {

    }

    @Override
    public void getPrime(int num1, int num2) {
        /**
         * 소수란? 약수가 1과 자기 자신뿐인 수
         * # 방법 1.
         * 자기 자신보다 작은 수들을 나누어봐서, 하나라도 나누어지면 소수가 아님
         * 입력받은 수(num1) ~ 입력받은 수(num2) -1 까지 나누어 하나라도 나누어 떨어지는가를 확인
         * 단점 : 연산 수가 많아 오래 걸림
         * */
        System.out.println("# 방법 1.");
        String s = "";
        for (int i = num1; i <= num2; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                s += i + " ";
            }
        }
        System.out.println(s);

        /**
         * # 방법 2. 에라토스테네스의 체
         * 소수가 되는 수의 배수를 지우면 남은 건 소수가 된다.
         * 소수가 무엇인지 찾을 필요가 없으며, 2부터 자기 자신을 제외한 배수가 되는 것을 지우면 된다.
         * 구하는 방법 :
         * 1) 2부터 소수를 구하고자 하는 구간의 모든 수를 나열한다.
         * 2) 소수가 되는 수의 배수를 지우면 남은 건은 소수만 된다.
         * 3) 자기 자신을 제외한 2의 배수를 모두 지운다.
         * 4) 남아 있는 수 가운데 3은 소수이므로 오른쪽에 3을 쓴다.
         * 5) 자기 자신을 제외한 3의 배수를 모두 지운다.
         * 6) 남아 있는 수 가운데 5는 소수이므로 오른쪽에 5를 쓴다.
         * 7) 자기 자신을 제외한 5의 배수를 모두 지운다.
         * 8) 위 과정을 반복한다.
         * */
        System.out.println("# 방법 2.");
        s = "";
        int[] prime = new int[num2 + 1];
        // 소수가 아니면 0
        for (int i = 2; i <= num2; i++) {
            prime[i] = i;
        }

        for (int i = 2; i <= num2; i++) {
            if (prime[i] == 0) continue;
            for (int j = 2*i; j <= num2; j+=i) { // num2까지의 수들 중 2의 배수부터 지우기
                prime[j] = 0;
            }
        }

        for (int i = num1; i <= num2; i++) {
            if (prime[i] != 0) {
                s += prime[i] + " ";
            }
        }
        System.out.println(s);
    }

    @Override
    public void leapYear(int year) {

    }

    @Override
    public void numberGolf(int num) {

    }
}
