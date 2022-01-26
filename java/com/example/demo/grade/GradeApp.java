package com.example.demo.grade;

/**
 * packageName: com.example.demo.grade
 * fileName   : GradeApp
 * author     : 최은아
 * date       : 2022-01-26
 * desc       :
   * 사용자로부터
   * 이름 [          ]
   * 국어 [          ]
   * 영어 [          ]
   * 수학 [          ]
   * 을 차례대로 입력 받아서
   * ########## 성적표 ########
   * 이름: 홍길동
   * > 국어: 80점
   * > 영어: 79점
   * > 수학: 80점
   * 총점: 239점
   * 평균(정수): 79점
   * 합격여부: 합격(불합격)
   * #######################
   * 출력되는 프로그램을 작성
   * 단, 합격 / 불합격 기준은
   * 평균 60점 이상이면 합격
 * */
public class GradeApp {
    public static String GRADE_TITLE = "성적표";
    private int kor;
    private int eng;
    private int math;
    private int total;
    private int avg;
    private String pass;

    public int getTotal(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        total = kor + eng + math;
        return total;
    }

    public int getAvg(int total) {
        this.total = total;
        avg = this.total / 3;
        return avg;
    }

    public String getGrade(int avg) {
        this.avg = avg;
        pass = (this.avg >= 60) ? "합격" : "불합격";
        return pass;
    }
}
