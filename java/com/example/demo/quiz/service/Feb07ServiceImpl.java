package com.example.demo.quiz.service;

import java.util.Random;
import java.util.Scanner;

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
    /*
     * author : 권솔이
     * */
    @Override
    public void dice(Scanner scanner) {
        /**
         * 같은 숫자가 나올 때까지 두 개의 주사위를 굴리는 게임
         * */
        int count = 1;
        while (true) {
            int one = (int) (Math.random() * 6) + 1;
            int two = (int) (Math.random() * 6) + 1;
            System.out.println(count + "번째 시도, 첫 번째 주사위 : " + one + ", 두 번째 주사위 : " + two);
            count++;
            if (one == two) {
                break;
            }
        }
    }
    /*
     * author : 하진희
     * */
    @Override
    public void rps(Scanner scanner) {
        Random random = new Random();
        int com = random.nextInt(3) + 1;
        System.out.println("1~3 사이의 숫자를 입력해주세요. (1 : 바위, 2 : 가위, 3 : 보)");
        int user = scanner.nextInt();
        int score = user - com;
        String[] str = {"", "바위", "가위", "보"};
        String s = "";
        if (user > 3) {
            System.out.println("1~3까지의 숫자를 입력해주세요.");
            return;
        } else {
            if (score == 0) {
                s = "무승부입니다.";
            } else if (score == -1 || score == 2) {
                s = "이겼습니다.";
            } else {
                s = "졌습니다.";
            }
        }
        System.out.println("컴퓨터 : " + str[com] + ", 유저 : " + str[user] + "\n" + s);
    }
    /*
     * author : 최은아
     * */
    @Override
    public void getPrime(Scanner scanner) {
        /**
         * 소수란? 약수가 1과 자기 자신뿐인 수 (1과 자기 자신만으로만 나누어지는 수)
         * # 방법 1.
         * 입력받은 수(num1) ~ 입력받은 수(num2)까지 하나라도 나누어 떨어지는가를 확인하는 작업을 반복한다.
         * 2부터 (입력받은 수 -1)까지 자기 자신보다 작은 수들을 나누어봐서, 하나라도 나누어지면 소수가 아니다.
         * 소수이면 flag = true, 소수가 아니면 flag = false
         * 소수 (flag == true) 이면 출력한다.
         * 단점 : 연산 수가 많아 오래 걸린다.
         * 참고) https://hahahoho5915.tistory.com/14
         * */
        System.out.println("1 이상의 첫 번째 숫자를 입력해주세요.");
        int num1 = scanner.nextInt();
        System.out.println("1 이상의 두 번째 숫자를 입력해주세요.");
        int num2 = scanner.nextInt();
        String s = "";

        System.out.println("# 방법 1.");
        for (int i = num1; i <= num2; i++) {
            boolean flag = true;
            if (i == 1) {
                flag = false;
                continue;
            }
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
         * 
         * [원리]
         * 1) 2부터 소수를 구하고자 하는 구간의 모든 수를 나열한다.
         * 2) 소수가 되는 수의 배수를 지우면 남은 건은 소수만 된다.
         * 3) 자기 자신을 제외한 2의 배수를 모두 지운다.
         * 4) 남아 있는 수 가운데 3은 소수이므로 오른쪽에 3을 쓴다.
         * 5) 자기 자신을 제외한 3의 배수를 모두 지운다.
         * 6) 남아 있는 수 가운데 5는 소수이므로 오른쪽에 5를 쓴다.
         * 7) 자기 자신을 제외한 5의 배수를 모두 지운다.
         * 8) 위 과정을 반복한다.
         * 
         * [구하는 방법]
         * 소수를 판별할 범위만큼 배열을 할당하여 해당하는 값을 넣어주고, 이후에 하나씩 지워나가는 방법을 이용
         * 1) 배열을 생성하여 초기화한다.
         * 2) 2부터 시작해서 특정 수의 배수에 해당하는 수를 모두 지운다.(지울 때 자기자신은 지우지 않고, 이미 지워진 수는 건너뛴다.)
         *    이때, 소수가 아니면 (지우면) 0이다.
         * 3) 입력받은 수부터 시작하여 남아있는 수를 모두 출력한다.
         *
         * 참고) https://velog.io/@velogmj/%EC%97%90%EB%9D%BC%ED%86%A0%EC%8A%A4%ED%85%8C%EB%84%A4%EC%8A%A4%EC%9D%98-%EC%B2%B4
         * */
        System.out.println("# 방법 2.");
        s = "";
        int[] prime = new int[num2 + 1];
        // 소수가 아니면 0
        // 1) 배열을 생성하여 초기화한다.
        for (int i = 2; i <= num2; i++) {
            prime[i] = i;
        }

        // 2) 2부터 시작해서 특정 수의 배수에 해당하는 수를 모두 지운다.(지울 때 자기자신은 지우지 않고, 이미 지워진 수는 건너뛴다.)
        for (int i = 2; i <= num2; i++) {
            if (prime[i] == 0) continue; // continue : 해당 반복을 끝내고 다음 반복 실행, 이미 지워진 수라면 건너뛰기
            for (int j = 2*i; j <= num2; j+=i) { // num2까지의 수들 중 2의 배수부터 지우기
                prime[j] = 0;
            }
        }

        // 3) 입력받은 수부터 시작하여 남아있는 수를 모두 출력한다.
        for (int i = num1; i <= num2; i++) {
            if (prime[i] != 0) {
                s += prime[i] + " ";
            }
        }
        System.out.println(s);
    }
    /*
     * author : 심민혜
     * */
    @Override
    public void leapYear(Scanner scanner) {
        /**
         * 특정 연도(Year)를 입력 받아 해당 연도가 윤년인지 평년인지 판별
         * 윤년 : 2월을 29일로 둬 4년 마다 1번씩 돌아오는 해 (4로 나눠 떨어지는 해는 윤년, 그밖의 해는 평년으로한다)
         *
         * [규칙]
         * 1. 4의 배수인 해는 윤년으로 한다.
         * 2. 100의 배수인 해는 윤년으로 하지 않는다.(=평년)
         * 3. 하지만 400의 배수인 해는 윤년으로 한다.
         *
         * [윤년 및 평년 구하는 조건]
         * 1. 연도가 4로 나누어 떨어지면 윤년 (year % 4 == 0)
         *      ex) 2020년, 2024년, 2028년, ...
         * 2. 1의 조건을 만족 하는 것 중, 연도가 100으로 나누어 떨어지면 평년  (year % 100 == 0)
         *      ex) 2100년, 2200년, 2300년, ...
         * 3. 2의 조건을 만족 하는 것 중, 400으로 나누어 떨어지면 윤년 (year % 400 == 0)
         *      ex) 2000년, 2400년, 2800년, ...
         *
         * [구하는 방법]
         * 1. if-else loop를 사용하여 조건이 참인 경우 윤년, 거짓인 경우에는 평년이라는 문구를 출력하도록한다.
         * (참고) && 는 and의 연산자, ||는 or의 연산자이다.
         *    (&&는 &&를 기준으로 좌항과 우항이 참이 되어야 출력이 가능하다.
         *    ||은 ||은 기준으로 좌항과 우항 중 하나라도 참이면 전체가 참이 되어 값이 출력된다.)
         * 2. 윤년 및 평년 구하는 조건을 토대로 다음에 부합하는 if-else loop를 생성한다.
         * [년도를 4로 나눈 나머지가 0]이면서(and),[년도를 100으로 나눈 것이 0이 아니거나][400으로 나눈 나머지가 0인것]
         * [기본값] = 평년
         *
         * */
        System.out.println("연도를 입력해주세요.");
        int year = scanner.nextInt();
        String s = "";
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            s += year + "년은 윤년입니다.";
        } else {
            s += year + "년은 평년입니다.";
        }
        System.out.println(s);

    }
    /*
     * author : 김지혜
     * */
    @Override
    public void numberGolf() {
        Scanner scanner = new Scanner(System.in);
        int answer = (int) (Math.random() * 100) + 1;
        int count = 0;
        String s = "";
        while (true) {
            count++;
            System.out.println("1과 100 사이의 값을 입력하세요.");
            int input = scanner.nextInt();

            if (input == answer) {
                s = "정답입니다. " + count + "번째 만에 맞히셨습니다.";
                break;
            } else if (input > answer) {
                System.out.println("더 작은 수를 입력하세요.");
            } else if (input < answer) {
                System.out.println("더 큰 수를 입력하세요.");
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
        System.out.println(s);
    }
}
