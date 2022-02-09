package com.example.demo.oop.service;

import com.example.demo.oop.domain.CellPhone;
import com.example.demo.oop.domain.GalPhone;
import com.example.demo.oop.domain.IPhone;
import com.example.demo.oop.domain.Phone;

/**
 * packageName: com.example.demo.oop.service
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
    public void useCelPhone(CellPhone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useIPhone(IPhone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useGalPhone(GalPhone phone) {
        System.out.println(phone.toString());
    }
}
