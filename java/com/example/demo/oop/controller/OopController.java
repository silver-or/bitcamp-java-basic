package com.example.demo.oop.controller;

import com.example.demo.oop.service.PhoneService;
import com.example.demo.oop.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : OopController
 * author     : 최은아
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-08    최은아       최초 생성
 */
public class OopController {
    public void execute(Scanner scanner) {
        PhoneService service = new PhoneServiceImpl();
        while (true) {
            System.out.println("\n[MENU] \n" +
                                "0. EXIT \n" +
                                "1. 집전화 \n" +
                                "2. 휴대폰 \n" +
                                "3. 아이폰 \n" +
                                "4. 갤럭시 노트");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit");
                    return;
                case "1" :
                    System.out.println("집전화");
                    service.usePhone(scanner);
                    break;
                case "2" :
                    System.out.println("휴대폰");
                    service.useCelPhone(scanner);
                    break;
                case "3" :
                    System.out.println("아이폰");
                    service.useIPhone(scanner);
                    break;
                case "4" :
                    System.out.println("갤럭시 노트");
                    service.useGalPhone(scanner);
                    break;
                default :
                    System.out.println("0~4 사이의 숫자를 입력해주세요.");
                    break;
            }
        }
    }
}
