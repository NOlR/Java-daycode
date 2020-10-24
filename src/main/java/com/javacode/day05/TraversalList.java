package com.javacode.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName TraversalList
 * @Description 遍历List的多种方式
 * @Author apple
 * @Date 2020/10/24
 **/
public class TraversalList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                Arrays.asList("tom ", "cat ", "Jane ", "jerry "));

        //方法1 集合类的通用遍历方式，从很早的版本就有，用迭代器迭代
        System.out.println("方法1：");
        Iterator<String> it1 = list.iterator();
        while (it1.hasNext()) {
            System.out.print(it1.next() + " ");
        }
        System.out.println();

        //方法2 集合类的通用遍历方式，从很早的版本就有，用迭代器迭代
        System.out.println("方法2：");
        for (Iterator it2 = list.iterator(); it2.hasNext(); ) {
            System.out.print(it2.next() + " ");
        }
        System.out.println();

        //方法3 增强for循环遍历
        System.out.println("方法3：");
        for (String value : list) {
            System.out.print(value + " ");
        }
        System.out.println();

        //方法4 一般型的for循环遍历
        System.out.println("方法4：");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //方法5 lambda遍历
        System.out.println("方法5：");
        list.forEach(item->System.out.print(item));
        System.out.println();

        //方法6 终极简洁版(方法引用)
        System.out.println("方法6：");
        list.forEach(System.out::print);
        System.out.println();
    }
}
