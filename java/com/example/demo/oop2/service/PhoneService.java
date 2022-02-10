package com.example.demo.oop2.service;

import com.example.demo.oop2.domain.CellPhone;
import com.example.demo.oop2.domain.GalPhone;
import com.example.demo.oop2.domain.IPhone;
import com.example.demo.oop2.domain.Phone;

/**
 * packageName: com.example.demo.oop2.service
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
    void useCellPhone(CellPhone cellPhone);
    void useIPhone(IPhone iPhone);
    void useGalPhone(GalPhone galPhone);
}
