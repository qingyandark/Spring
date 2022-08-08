package cn.qingyandark.service.impl;

import cn.qingyandark.dao.BookDao_5;
import cn.qingyandark.dao.UserDao_5;
import cn.qingyandark.service.BookService_5;

/**
 * User: qingyandark
 * Time: 2022-08-06 19:11:32
 * DI入门，依赖注入
 * 删除业务层中使用new方式创建的DI
 */

public class BookServiceImpl_5 implements BookService_5 {
    private BookDao_5 bookDao_5;
    private UserDao_5 userDao_5;

    @Override
    public void save() {
        System.out.println("BookService ......");
        bookDao_5.save();
        userDao_5.save();
    }

    public void setBookDao_5(BookDao_5 bookDao_5) {
        this.bookDao_5 = bookDao_5;
    }

    public void setUserDao_5(UserDao_5 userDao_5) {
        this.userDao_5 = userDao_5;
    }
}
