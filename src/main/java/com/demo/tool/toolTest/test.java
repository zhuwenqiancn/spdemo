package com.demo.tool.toolTest;

import java.util.Calendar;
import java.util.Date;

public class test {

    private static Date getDt() {
        return new Date();
    }

    public static void main(String[] args) {
        Date dt = new Date();
        Calendar calendar = Calendar.getInstance();

        try {
            for (int i = 0; i < 100; i++) {
                //Thread.sleep(1000);
                System.out.println("测试开始：---" + i + " :" + getDt().getTime());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }


    }
}
