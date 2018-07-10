package com.ggh;

import java.util.Scanner;

public class unit01Scanner {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        while(true){
            System.out.println("请输入数字：");
            String  sin = scn.next();
            if("esc".equals(sin)){
                System.out.println("已退出");
                break;
            }
            if(sin.matches("(-)?\\d+")){
                int age = Integer.parseInt(sin);
                System.out.print("你输入的是："+(age>0?"正数":(age==0?"0":"负数")));
                System.out.println((" (退出请输入esc)"));
            }else{
                System.out.println("非法输入 (退出请输入esc)");
            }


        }





    }
}
