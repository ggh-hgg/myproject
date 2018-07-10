package com.ggh;

public class Emp3 {
    String name;
    int age;
    char gender;
    double salary;

    public Emp3() {
        this("ggh");
        System.out.println("空构造方法");
    }

    public Emp3(String name) {
        System.out.println("Emp3(String name)");
        this.name = name;
    }

    public Emp3(String name, int age) {
        System.out.println("Emp3(String name ,int age)");
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Emp3 e = new Emp3();
        // e.name="ggh";
        e.age = 27;
        e.gender = '1';
        e.salary = 4000;
        e.printInfo();
        //e.printInfo2("asf");
        int[] a = new int[10];

        String b = String.valueOf(1);

    }

    public void printInfo() {
        System.out.println("--------------");
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + gender);
        System.out.println("薪水：" + salary);
        System.out.println("---------------");
        for (int i = 0; i < 10; i++) {
            int j = 40;
            int m = i + j;
            System.out.println("m=" + m);

        }


    }

    //overload 方法重载
    public void printInfo3(String names, String id) {
        System.out.println("-------------");
        System.out.println("姓名：" + names);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + gender);
        System.out.println("薪水：" + salary);
    }

    public int getAge() {
        this.age = 20;
        return this.age;
    }


}
