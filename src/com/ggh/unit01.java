package com.ggh;

import java.util.Arrays;
import java.util.Scanner;

public class unit01 {
    public static void main(String[] args) {
        /*
         *变量的声明
         */
        /*int a = 1;
        int b=4, c=3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        double 我 =3.01;
        float breaks = 200.2f;
        System.out.println(我);

        //8种基本类型
        byte b1 = 1;
        short s1 =2;
        int  i1 =3;
        long l1 = 4l;
        float f1 =5.0f;
        double d1 = 6.0;
        char c1 ='b';
        boolean b2= true;

        int c2 = 5/3;
        System.out.println(c2);*/

        /*int total =87;
        int error = 23;
        int percent1 = error/total*100;
        int percent2 = 100*error/total;
        System.out.println(percent1);
        System.out.println(percent2);

        double d2 =5;
        double d3 =2;

        //二进制系统中无法精确的标识1/10
        double d4 =2.9;
        double d5=2.8;


        System.out.println(d2-d3);
        System.out.println(d4-d5);

        char c2='中';
        char c3 = '\u4e2d';
        System.out.println(c2);
        System.out.println(c3);

        char c4='\\';
        System.out.println(c4);

        boolean b2 =false;*/

        /*byte b3 = 1;
        short s3 =2;
        char c3 =3;
        int i3 = b3+s3+c3;

        int i4=1;
        long l4=1000000l;
        long i5= i4+l4;
        int  i6=(int)(i4+l4);

        double d5=80.0/100;
        double d6=80/100;
        System.out.println("d5:"+d5);
        System.out.println("d6:"+d6);*/

        /*int count = 30;
        count =60;
        System.out.println(count);
        int balance = (int )518.3;
        System.out.println(balance);
        System.out.println(System.currentTimeMillis());*/

        /*int num = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        num = scn.nextInt();
        switch(num){
            case 1:
                System.out.println("11111");
                break;
            case 2:
                System.out.println("2222");
                break;
            case 0:
                break;
        }*/

        /*int[] arr = new int [10];
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/
        //char[] 数组初始值为'\u0000'
       /* char [] arr2 = new char[10];
        for (int i = 0; i <arr2.length ; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("-------------");
        char a = '\u0000';
        System.out.println("a:"+a);
        System.out.println("-------------");
        char b = 0;
        System.out.println("b:"+b);*/

       /*int [] a ={1,2,3,4,5,6};
       int [] b = new int [a.length];
       System.arraycopy(a,0,b,0,a.length);
       a[1]=20;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));*/

        /*int [] a ={1,2,3,4,5,6};
        int [] b = a;

        a[1]=20;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));*/

        /*int [] a ={1,20,9,7,18,66};
        int [] b = Arrays.copyOf(a,a.length+2);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));*/

        //二维数组
        int [][][] arr = new int[3][3][3];
        arr[0][0][0] = 1;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                for (int k = 0; k <arr[i][j].length ; k++) {
                    arr[i][j][k]=i+j+k;
                    System.out.print(arr[i][j][k]+" ");

                }
                System.out.println();
            }
            System.out.println();
            System.out.println("测试");

        }
        arr=null;

        System.gc();



    }

}