package com.example.demo.oop2.domain;



/**
 * packageName: com.example.demo.oop2.domain
 * fileName   : IPhone
 * author     : 최은아
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-09    최은아       최초 생성
 */
public class IPhone extends CalcDTO {
    public final static String KIND = "아이폰";
    protected String search;

    public IPhone(String company) {
        super(KIND, company, "이동");
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return String.format("%s에서 만든 %s을 사용해서 %s 중에 %s한다.",
                super.getCompany(), KIND, super.getMove(), search);
    }
}
