package com.javacode.day07;

import java.io.*;

/**
 * @ClassName FileReadMemo
 * @Description 文件读取练习——用InputStream来读取文件
 * @Author apple
 * @Date 2020/10/26
 **/
public class FileReadMemo {
    public static void main(String[] args) throws IOException {
        //创建一个文件File对象，注意需要显示抛出异常（IOException 是编译时异常）
        //可以用try catch捕获，也可以在方法签名处使用 throws 输出
        File file = new File("/Users/apple/Desktop/picture/black.jpg");
        //创建一个字节输入流，此处有上转型对象
        InputStream is = new FileInputStream(file);
        //准备和字节大小一致的字节数组
        byte[] b = new byte[(int) file.length()];
        //通过字节输入流将文件读入数组
        is.read(b);
        //准备输出文件对象
        File outputFile = new File("/Users/apple/Desktop/picture/Testpic.jpg");
        OutputStream os =new FileOutputStream(outputFile);
        //通过字节输出流将数组b中的文件复制到目标文件
        os.write(b);
        //关闭流
        is.close();
        os.close();
    }
}
