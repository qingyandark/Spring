package cn.qingyandark.factory;

import cn.qingyandark.dao.BookDao_1;
import cn.qingyandark.dao.impl.BookDaoImpl_1;
import org.springframework.beans.factory.FactoryBean;

public class BookDaoFactoryBean_3 implements FactoryBean<BookDao_1> {
    // 代替原始工厂中创建实例的方法
    @Override
    public BookDao_1 getObject() throws Exception {
        System.out.println("BookDaoFactoryBean_3 setup ......");
        return new BookDaoImpl_1();
    }

    // 返回类型
    @Override
    public Class<?> getObjectType() {
        return BookDao_1.class;
    }

    // 单例=true
    @Override
    public boolean isSingleton() {
        return false;
    }
}