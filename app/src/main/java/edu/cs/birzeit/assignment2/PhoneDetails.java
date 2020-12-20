package edu.cs.birzeit.assignment2;


public class PhoneDetails {
    private String name;
    private String  screen;
    private String os;
    private String battery;
    private String memory;
    private String weight;


    public static final PhoneDetails[] phones = {
            new PhoneDetails("-Iphone 12","* Screen: 6.1 inch",
                    "* Operating System: iOS 14","* Battery: 2815 mAh"
           ,"* Memory: 64 GB","* Weight: 164 gram"),

            new PhoneDetails("-Redmi 8 Pro","* Screen: 6.53 inch",
                    "* Operating System: Android 9.0 pie","* Battery: 4500 mAh"
                    ,"* Memory: 256 GB","* Weight: 199 gram"),

            new PhoneDetails("-Redmi Note 9 Pro Max","* Screen: 6.67 inch",
                    "* Operating System: Android 10 ","* Battery: 5020 mAh"
                    ,"* Memory: 64 GB","* Weight: 209 gram"),

            new PhoneDetails("-Iphone 10","* Screen: 5.8 inch",
                    "* Operating System: iOS 13.6.1.","* Battery: 2716 mAh"
                    ,"* Memory: 64/256 GB","* Weight: 174 gram"),

            new PhoneDetails("-Redmi Note 10","* Screen: 6.57 inch",
                    "* Operating System: Android 10 ","* Battery: 4800 mAh"
                    ,"* Memory: 256/64 GB","* Weight: 210 gram"),

            new PhoneDetails("-Samsung s10","* Screen: 6.1 inch",
                    "* Operating System: Android 9","* Battery: 3400 mAh"
                    ,"* Memory:128 GB","* Weight: 195 gram"),

            new PhoneDetails("-Samsung s20 ultra","* Screen: 6.2 inch",
            "* Operating System: Android 10","* Battery: 4000 mAh"
            ,"* Memory:128 GB","* Weight: 190 gram"),

            new PhoneDetails("-nokia lumia","* Screen 4.5 inch",
                    "* Operating System: Android 8.1","* Battery: 2000 mAh"
                    ,"* Memory:8 GB","* Weight: 174 gram"),

            new PhoneDetails("-oopo a53","* Screen 6.5 inch",
                    "* Operating System: Android 10","* Battery: 5000 mAh"
                    ,"* Memory:64/128 GB","* Weight: 200 gram"),

            new PhoneDetails("-relmi 7 pro","* Screen 6.4 inch",
                    "* Operating System: Android 10","* Battery: 4500 mAh"
                    ,"* Memory:128 GB","* Weight: 190 gram"),



    };

    public PhoneDetails(String name, String screen, String os, String battery, String memory, String weight) {
        this.name = name;
        this.screen = screen;
        this.os = os;
        this.battery = battery;
        this.memory = memory;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getScreen() {
        return screen;
    }

    public String getOs() {
        return os;
    }

    public String getBattery() {
        return battery;
    }

    public String getMemory() {
        return memory;
    }

    public String getWeight() {
        return weight;
    }
}
