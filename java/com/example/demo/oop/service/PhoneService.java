package com.example.demo.oop.service;

import com.example.demo.oop.domain.CellPhone;
import com.example.demo.oop.domain.GalPhone;
import com.example.demo.oop.domain.IPhone;
import com.example.demo.oop.domain.Phone;

/**
 * packageName: com.example.demo.oop.service
 * fileName   : PhoneService
 * author     : 최은아
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-09    최은아       최초 생성
 */
public interface PhoneService {
    void usePhone(Phone phone);
    void useCelPhone(CellPhone phone);
    void useIPhone(IPhone phone);
    void useGalPhone(GalPhone phone);
}
