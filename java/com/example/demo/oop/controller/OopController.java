package com.example.demo.oop.controller;

import com.example.demo.oop.domain.CelPhone;
import com.example.demo.oop.domain.GalPhone;
import com.example.demo.oop.domain.IPhone;
import com.example.demo.oop.domain.Phone;
import com.example.demo.oop.service.PhoneService;
import com.example.demo.oop.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.oop.controller
 * fileName   : OopController
 * author     : 최은아
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-09    최은아       최초 생성
 */
public class OopController {
    public void execute(Scanner scanner) {
        while (true) {
            // 4가지 중에 하나라도 충족하지 않으면 OOP(객체지향프로그래밍)가 아니다.
            System.out.println("\n[서브 메뉴] \n" +
                    "0. EXIT \n" +
                    "1. 은닉화(Encapsulation) \n" +
                    "2. 상속 (Inheritance) \n" +
                    "3. 추상화 (Abstraction) \n" +
                    "4. 다형성 (Polymorphism)");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("종료");
                    return;
                case "1" :
                    System.out.println("POJO가 은닉화다.");
                    break;
                case "2" :
                    System.out.println("extends가 상속이다.");
                    Phone phone = new Phone("금성전화기", "금성전자");
                    CelPhone celPhone = new CelPhone("코비", "삼성 애니콜", "이동");
                    IPhone iPhone = new IPhone("애플");
                    GalPhone galPhone = new GalPhone("삼성");
                    PhoneService phoneService = new PhoneServiceImpl();
                    System.out.println("\n[소메뉴] \n" +
                            "0. EXIT\n" +
                            "1. 집전화\n" +
                            "2. 휴대폰\n" +
                            "3. 아이폰\n" +
                            "4. 갤럭시");
                    switch (scanner.next()) {
                        case "0" :
                            System.out.println("종료");
                            return;
                        case "1" :
                            System.out.println("### 집전화 ###");
                            phone.setCall("여보세요. *** 입니다.");
                            phoneService.usePhone(phone);
                            break;
                        case "2" :
                            System.out.println("### 휴대폰 ###");
                            celPhone.setCall("안녕하세요.");
                            phoneService.useCelPhone(celPhone);
                            break;
                        case "3" :
                            System.out.println("### 아이폰 ###");
                            iPhone.setSearch("실시간 확진자 수를 검색");
                            phoneService.useIPhone(iPhone);
                            break;
                        case "4" :
                            System.out.println("### 갤럭시 ###");
                            galPhone.setPay("삼성페이");
                            phoneService.useGalPhone(galPhone);
                            break;
                        default :
                            System.out.println("0~4 사이의 숫자를 입력해주세요.");
                            break;
                    }
                    break;
                case "3" :
                    System.out.println();
                    break;
            }
        }
    }
}
