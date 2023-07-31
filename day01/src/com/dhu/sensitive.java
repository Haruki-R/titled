package com.dhu;

import java.util.Scanner;

public class sensitive {
    public static void main(String[] args) {
        String [] sensitive={"wcnm","sb","xjp"};
        Scanner sc =new Scanner(System.in);
        System.out.println("please input your sentence");
        String str=sc.next();
       // String newstr="";
        for (int i = 0; i < sensitive.length; ++i)
            str = str.replaceAll(sensitive[i],"***");

        System.out.println(str);

    }

}
