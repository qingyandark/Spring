package cn.qingyandark.dao.impl;

import cn.qingyandark.dao.BookDao_5;

public class BookDaoImpl_5_2 implements BookDao_5 {
    private int num;
    private String name;

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("BookDaoImpl_5_2 ......" + name + ", " + num);
    }
}
