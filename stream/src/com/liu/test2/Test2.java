package com.liu.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        /*
        创建一个ArrayList集合，并添加以下字符串，字符串中前面是姓名，后面是年龄
        "zhangsan，23"       "lisi，24"       "wangwu，25”
            保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值
         */

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "zhangsan,23", "lisi,24", "wangwu,25");

//        Map<String, Integer> collect = list.stream()
//                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
//                .collect(Collectors.toMap(new Function<String, String>() {
//                                              @Override
//                                              public String apply(String s) {
//                                                  return s.split(",")[0];
//                                              }
//                                          },
//                        new Function<String, Integer>() {
//                            @Override
//                            public Integer apply(String s) {
//                                return Integer.parseInt(s.split(",")[1]);
//                            }
//                        }
//                ));

        Map<String, Integer> collect = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));

        System.out.println(collect);


    }
}
