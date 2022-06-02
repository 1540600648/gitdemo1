package com.atguigu.git;

public class Gitdemo {
    public static void main(String[] args) {
        System.out.println("hellogit!!!!!reset 这种方式会直接把 HEAD 以及 MASTER 一起拉回那个版本，" +
                "并且会丢失目标版本之后的内容，虽然可以通过 reflog 找到后面的版本，但是这种方式比较强烈的，可能会造成数据丢失");
    }

}
