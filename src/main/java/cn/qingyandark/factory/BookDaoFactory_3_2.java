package cn.qingyandark.factory;

import cn.qingyandark.dao.BookDao_1;
import cn.qingyandark.dao.impl.BookDaoImpl_1;

public class BookDaoFactory_3_2 {
    public BookDao_1 getBookDao(){
        System.out.println("BookDaoFactory_3_2 setup ......");
        return new BookDaoImpl_1();
    }
}
