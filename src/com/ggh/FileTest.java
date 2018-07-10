package com.ggh;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        //默认目录和项目目录同级
        // D:\IdeaProjects\workspace\myproject\test1
        File dir = new File("1"+ File.separator+"2");
        dir.mkdirs();

        File dir2 = new File("D:\\HGG");
        if(!dir2.exists()){
            boolean success= dir2.mkdir();
            if(success){
                System.out.println("创建目录成功");
            }else{
                System.out.println("创建目录失败或目录已存在");
            }

        }else{
            System.out.println("目录已存在");
        }

        File file1 = new File(dir2,"必读.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File[] subs = dir2.listFiles();


        for (File sub:subs){
            System.out.println("File:"+sub);
        }
        //当前路径
        File current = new File(".");
        try {
            System.out.println(current.getAbsolutePath());
            System.out.println(current.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
