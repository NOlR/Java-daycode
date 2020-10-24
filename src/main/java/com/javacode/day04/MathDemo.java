package com.javacode.day04;

/**
 * @ClassName MathDemo
 * @Description TODO
 * @Author apple
 * @Date 2020/10/24
 **/
public class MathDemo {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-321));
        System.out.println("-------------");

        //向上取整
        System.out.println(Math.ceil(30.1));
        System.out.println(Math.ceil(30.9));
        System.out.println(Math.ceil(30.0));
        System.out.println("-------------");

        //向下取整
        System.out.println(Math.floor(30.1));
        System.out.println(Math.floor(30.9));
        System.out.println(Math.floor(30.0));
        System.out.println("-------------");

        //四舍五入
        System.out.println(Math.round(20.4));
        System.out.println(Math.round(20.5));

        //计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个
        //符合要求的数量
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        //通过for循环，变量i就是区间之内的所有整数
        for (int i = (int) min; i < max; i++) {
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                System.out.print(i+"  ");
                count++;
            }
        }

    }
}
