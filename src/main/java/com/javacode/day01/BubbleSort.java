package com.javacode.day01;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序的实现
 * @Author apple
 * @Date 2020/10/20
 **/
/**
 *
 * @param a 数组
 * @param n 排序趟数
 * */
public class BubbleSort {
    public static void bubbleSort(int[] a, int n) {
        int i, j;
        //表示n次排序的过程
        for (i = 0; i < n; i++) {
            for (j = 1; j < n - i; j++) {
                //前面的数字大于后面的数字就交换
                if (a[j - 1] > a[j]) {
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 3, 12, 4, 2, 4, 32, 54, 5, 45, 43, 5, 43, 53};
        BubbleSort.bubbleSort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
