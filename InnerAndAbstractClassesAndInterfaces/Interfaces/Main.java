package com.bikashgurung;

public class Main {

    public static void main(String[] args){
        // this is wrong
        // ITelephone timsPhone = new ITelephone();
        // here we make the two instance deskphone and mobilephone using interface
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(556766);
        timsPhone.powerOn();
        timsPhone.callPhone(556766);
        timsPhone.answer();
    }
}
