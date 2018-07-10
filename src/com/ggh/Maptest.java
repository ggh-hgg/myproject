package com.ggh;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maptest {
    public static void main(String[] args) {
        Map<String, String> strmap = new HashMap<String, String>();
        strmap.put("name", "hgg");
        strmap.put("age", "27");
        strmap.put("家乡", "北流");
        System.out.println(strmap);

        //1:遍历集合的所有key,使用keySet
        Set<String> se = strmap.keySet();
        for(String key:se){
            System.out.println(key+":"+strmap.get(key));
        }
        //2:遍历mapvalue
        Collection<String> values = strmap.values();
        for(String va:values){
            System.out.println("value:"+va);
        }
        System.out.println("33333333");
        //3:使用entrySet
        Set<Map.Entry<String, String>> entries = strmap.entrySet();
        System.out.println(entries);
        for (Map.Entry<String,String> s :entries){
            System.out.println(s.getKey()+":"+s.getValue());
        }



    }
}
