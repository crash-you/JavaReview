package com.liumou.Zifuji;

public class detail {

    public static void main(String[] args) {


        //字符输入流流原理解析
        //创建字符输入流对象
        //底层:关联文件，并创建缓冲区（长度为8192的字节数组)
        //读取数据
        //底层:1.判断缓冲区中是否有数据可以读取
        //2.缓冲区没有数据:就从文件中获取数据，装到缓冲区中，每次尽可能装满缓冲区
        //如果文件中也没有数据了，返回-1
        //3.缓冲区有数据:就从缓冲区中读取。
        //空参的read方法:一次读取一个字节，遇到中文一次读多个字节，把字节解码并转成十进制返回
        //有参的read方法:把读取字节，解码，强转三步合并了，强转之后的字符放到数组中

        //字符输出流细节
        //写出的数据首先会放到缓冲区里，如果缓冲区写满，将会自动将缓冲区的内容释放（写到文件里）
        //可以调用flush方法将写的数据加载到文件里，之后还可以继续写入

    }
}