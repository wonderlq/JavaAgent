package com.merlin.test;

/**
 * @author lq
 * @since 1.0.0
 * Created On 2019-01-31 09:56
 */
public class TestAttachMain2 {

    public static void main(String[] args) {
        sayHi();
    }


    private static void sayHi() {
        while (true) {
            System.out.println("i'm attach program，hello world");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
