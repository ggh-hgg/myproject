package com.ggh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class String01 {

    String name ;
    int age;
    char gerner;

    public String01(String name,int age,char gerner){
        this.name=name;
        this.age=age;
        this.gerner=gerner;
    }

   /* public String toString(){
        System.out.println("toStirng");
        return "[name:"+name+" age:"+age+" gerner:"+gerner+"]";
    }

    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(obj==this){
            return true;
        }
        if(obj instanceof String01){
            String01 s = (String01)obj;
            return s.name==name&&s.age==age&&s.gerner==gerner;
        }else{
            return false;
        }
    }
*/

    @Override
    public String toString() {
        return "String01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gerner=" + gerner +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof String01)) return false;
        String01 string01 = (String01) o;
        return age == string01.age &&
                gerner == string01.gerner &&
                Objects.equals(name, string01.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, gerner);
    }



    public static void main(String[] args) {
        String01 str = new String01("hgg",27,'B');
        String01 str1 = new String01("hgg",28,'G');
        String01 str2 = new String01("hgg",28,'G');
        System.out.println(str.toString());
        System.out.println(str.equals(str1));
        System.out.println(str2.equals(str1));

        Collection<String01> c1 = new ArrayList<String01>();
        c1.add(str);
        c1.add(str1);
        System.out.println("-----");
        System.out.println(c1);
        System.out.println(c1.contains(str));
        System.out.println(c1.contains(str2));
        System.out.println("1111111111111111");
//        for(String01 e:c1){
//            System.out.println(e);
//            if(e.age==28){
//                e.remove(e);
//
//            }
//        }
        //删除集合中的元素使用迭代器
        Iterator<String01> c =c1.iterator();
        while(c.hasNext()){
            String01 s= c.next();
            if(s.age==28){
                c.remove();
            }
        }
        System.out.println(c1);



    }
}
