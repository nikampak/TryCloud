package com.Utilities;

public class Sleep {

    public static void sleep(int howLongSecond) {
        try {
            Thread.sleep(howLongSecond * 1000);
        } catch (InterruptedException e) {
        }
    }
}
