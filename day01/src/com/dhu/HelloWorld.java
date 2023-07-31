package com.dhu;

import java.util.Scanner;

public class HelloWorld {
    public  static void playGame(){
        System.out.println("play game");
    }
    public static void main(String[] args) {
        //System.out.println("HelloWorld.main");
        System.out.println("hello world");
        String s1=new String("rhr");
        System.out.println("please enter your name");
        Scanner sc = new Scanner(System.in);
        String s2=sc.next();
        boolean flag = s1.equalsIgnoreCase(s2);
        String s3="匹配成功";
        if(flag)
            System.out.println(s3);
        else
            System.out.println("failed");


    }
}
