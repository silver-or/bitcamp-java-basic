package com.example.demo.oop2.domain;

/**
 * packageName: com.example.demo.oop2.domain
 * fileName   : Phone
 * author     : 최은아
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-09    최은아       최초 생성
 */
public class Phone {
    protected String kind;
    protected String company;
    protected String call;
    
    public Phone(String kind, String company) {
        this.kind = kind;
        this.company = company;
    }

    public String getKind() {
        return kind;
    }

    public String getCompany() {
        return company;
    }
    
    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return "집 전화기 {" +
                "폰 종류='" + kind + '\'' +
                ", 제조사='" + company + '\'' +
                ", 통화내역='" + call + '\'' +
                '}';
    }
}
