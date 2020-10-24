package com.javacode.day04;

import java.util.Arrays;

/**
 * @ClassName ArrayDemo
 * @Description TODO
 * @Author apple
 * @Date 2020/10/24
 *
 * 备注：
 * 1.如果是数值，sort默认按升序从小到大
 * 2.如果是字符串，sort默认按照字母升序
 * 3.如果是自定义的类型，那么这个自定义的类型需要有Comparable或者Comparator接口的支持
 **/
public class ArrayDemo {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        //将int[]数组按照默认格式变成字符串
        String intStr = Arrays.toString(intArray);
        System.out.println("字符串格式化之后的数组：" + intStr);

        //对整型数组排序
        int[] array1 = {2, 1, 3, 10, 23, 4, 40, 121, 10};
        Arrays.sort(array1);
        System.out.println("排序后的字符串：" + Arrays.toString(array1));

        //对字符串数组排序
        String[] array2 = {"bbb", "aaa", "ccc"};
        Arrays.sort(array2);
        System.out.println("字符串数组排序" + Arrays.toString(array2));

        //讲一个随机字符串中的所有字符升序排序，并倒序打印
        String str = "dsajdsadaoisduiaouio4329dsajkl42";
        //如何进行升序排序：sort
        //必须是一个数组，才能用Arrays.sort方法
        //String转成数组用toCharArray
        char[] chars = str.toCharArray();
        //对字符数组进行升序排列
        Arrays.sort(chars);
        //倒序遍历
        for (int i = chars.length - 1; i >= 0; i--){
            System.out.print(chars[i]+"  ");
        }

    }
}
