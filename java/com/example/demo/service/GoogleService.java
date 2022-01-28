package com.example.demo.service;

import com.example.demo.domain.GoogleDTO;

/**
 * packageName: com.example.demo.google
 * fileName   : googleDemo
 * author     : 최은아
 * date       : 2022-01-25
 * desc       : GoogleApp을 실행하는 컨트롤러
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-01-25    최은아       최초 생성
 */
public class GoogleService {
    public String search(GoogleDTO google) {
        return String.format("\'%s\'을(를) 검색한 결과입니다.", google.getWord());
    }
}
