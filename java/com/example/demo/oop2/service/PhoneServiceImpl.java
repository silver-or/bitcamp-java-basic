package com.example.demo.oop2.service;

import com.example.demo.oop2.domain.CellPhone;
import com.example.demo.oop2.domain.GalPhone;
import com.example.demo.oop2.domain.IPhone;
import com.example.demo.oop2.domain.Phone;

/**
 * packageName: com.example.demo.oop2.service
 * fileName   : PhoneServiceImpl
 * author     : 최은아
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-02-09       최은아       최초 생성
 */
public class PhoneServiceImpl implements PhoneService{
    @Override
    public void usePhone(Phone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useCellPhone(CellPhone cellPhone) {
        System.out.println(cellPhone.toString());
    }

    @Override
    public void useIPhone(IPhone iPhone) {
        System.out.println(iPhone.toString());
    }

    @Override
    public void useGalPhone(GalPhone galPhone) {
        System.out.println(galPhone.toString());
    }
}
