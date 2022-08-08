package cn.qingyandark;

import cn.qingyandark.dao.BookDao_5;
import cn.qingyandark.dao.impl.BookDaoImpl_5;
import cn.qingyandark.service.BookService_5;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: qingyandark
 * Time: 2022-08-06 19:52:10
 * 依赖注入方式研究
 * 1. setter注入
 *    a. 简单类型（基本数据类型、String）
 *       提供可访问的set方法，提供value
 *    b. 引用类型
 * 2. 构造器注入
 *    a. 简单类型
 *    b. 引用类型
 */

public class _5_DI_methods {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("_5_DI_methods.xml");
        BookService_5 bookService_5 = (BookService_5)ctx.getBean("bookService_5");
        bookService_5.save();

        BookDao_5 BookDao_5 = (BookDao_5)ctx.getBean("bookDao_5_2");
        BookDao_5.save();
    }
}