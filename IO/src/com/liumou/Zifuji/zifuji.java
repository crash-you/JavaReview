package com.liumou.Zifuji;

public class zifuji {
    public static void main(String[] args) {

        /*
         *   存储英文，一个字节就行
         *   计算机最小存储单元 字节
         *   一个字节8位二进制数字
         * */

        //GBK字符集
        //一个汉字两个字节存储
        //高位字节二进制一定以1开头，转成十进制后一定为负数


        //Unicode 字符集 ： 万国码
        /*
         *   UTF-8 编码规则：用1---4个字节保存，是一个编码方式
         * --中文汉字三个字节表示 ，第一个二进制首位一定是0
         * -- 英文字母一个字节表示 ，第一个二进制首位一定是1
         *
         */

        //为什么会有乱码
        /*
        * 1.读取时未读完整个汉字 。字节流：一次读取一个字节
        * 2.编码和解码的方式不统一
        * */






    }

}
