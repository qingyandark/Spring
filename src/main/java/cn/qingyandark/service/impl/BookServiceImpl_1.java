package cn.qingyandark.service.impl;

import cn.qingyandark.dao.BookDao_1;
import cn.qingyandark.service.BookService_1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * User: qingyandark
 * Time: 2022-08-06 19:11:32
 * DI入门，依赖注入
 * 删除业务层中使用new方式创建的DI
 */

@Service
public class BookServiceImpl_1 implements BookService_1 {
    @Autowired
    private BookDao_1 bookDao;

    @Override
    public void save() {
        System.out.println("BookService ......");
        bookDao.save();
    }

    public List<BookDao_1> seleceAll(){
        List<BookDao_1> ans = new ArrayList<>();
        return ans;
    }

    // 容器通过该方法为bookDao传入实例对象
    public void setBookDao(BookDao_1 bookDao) {
        this.bookDao = bookDao;
    }
}
