package com.javacode.day04;

/**
 * @ClassName MyClassTest
 * @Description MyClass测试
 * @Author apple
 * @Date 2020/10/24
 *
 * 一旦使用static修饰成员方法，那么这就成为了静态方法，静态方法不属于对象，而是属于类的
 * 如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它。
 * 如果有了static关键字，那么不需要创建对象，直接就能通过类名称来使用它。
 * 无论是成员变量，还是成员方法。如果有了static，都推荐使用类名称进行调用。
 * 静态变量：类名称.静态变量
 * 静态方法：类名称.静态方法()
 * ！！！！！！！注意
 * 1.静态不能直接访问非静态。
 * 原因：因为在内存当中是【先】有的静态内容，【后】有的非静态内容。
 * "先人不知道后人，但是后人知道现人。"
 * 2.静态方法当中不能用this。
 * 原因:this代表当前对象，通过谁调用的方法，谁就是当前对象。
 **/
public class MyClassTest {
    public static void myMethod(){
        System.out.println("自己的方法！");
    }
    public static void main(String[] args) {
        //首先创建对象
        MyClass obj = new MyClass();
        //然后通过对象.属性或者方法使用没有static关键字内容
        obj.method();

        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称来调用
        //正确但是不推荐，这种写法在编译之后也会被javac翻译称为"类名称.静态方法名"
        //obj.methodStatic();

        //推荐这种写法
        MyClass.methodStatic();

        //对于本来当中的静态方法，可以省略类名称
        myMethod();
        //完全一致
        MyClassTest.myMethod();

    }

}
