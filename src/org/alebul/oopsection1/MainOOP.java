package org.alebul.oopsection1;

public class MainOOP {
    public static void main(String[] args) {
        Phone iphone = new Phone();

        iphone.name = "Iphone 12 mini";
        iphone.screenSize = 5;
        iphone.memoryRam = 128;
        iphone.camera = 32;

        iphone.playMusic("NewTrack");

    }
}
