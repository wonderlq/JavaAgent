package com.merlin.test;

/**
 * @author lq
 * @since 1.0.0
 * Created On 2019-01-31 09:56
 */
public class TestAttachMain {

    public static void main(String[] args) {
        System.out.println(sayHi());
    }


    private static String sayHi() {
        System.out.println("i'm attach program，hello world");
        return "hi";
    }
}
