package com.example.demo.service;

import com.example.demo.domain.KakaoDTO;

/**
 * packageName: com.example.demo.kakao
 * fileName   : KakaoDemo.java
 * author     : 최은아
 * date       : 2022-01-24
 * desc       : KakaoApp을 실행하는 컨트롤러
 * ================================
 * DATE             AUTHOR        NOTE
 * ================================
 * 2022-01-24       최은아       최초 생성
 */

//import com.example.demo.kakao.KakaoApp // 같은 패키지는 import 생략 가능

public class KakaoService {
    public String kakao(KakaoDTO kakao) {
        return String.format("telno %s, message %s", kakao.getTelno(), kakao.getMessage());
    }
}
