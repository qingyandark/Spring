package cn.qingyandark.factory;

import cn.qingyandark.dao.BookDao_1;
import cn.qingyandark.dao.impl.BookDaoImpl_1;

public class BookDaoFactory_3 {
    static BookDao_1 getBookDao(){
        System.out.println("BookDaoFactory_3 setup ......");
        return new BookDaoImpl_1();
    }
}
