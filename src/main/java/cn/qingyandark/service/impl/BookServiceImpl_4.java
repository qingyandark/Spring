package cn.qingyandark.service.impl;

import cn.qingyandark.dao.BookDao_1;
import cn.qingyandark.service.BookService_1;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * User: qingyandark
 * Time: 2022-08-06 19:11:32
 * DI入门，依赖注入
 * 删除业务层中使用new方式创建的DI
 */

public class BookServiceImpl_4 implements BookService_1, InitializingBean, DisposableBean {
    private BookDao_1 bookDao;

    @Override
    public void save() {
        System.out.println("BookService ......");
        bookDao.save();
    }

    // 容器通过该方法为bookDao传入实例对象
    public void setBookDao(BookDao_1 bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
