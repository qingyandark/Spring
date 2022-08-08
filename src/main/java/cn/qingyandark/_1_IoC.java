package cn.qingyandark;

import cn.qingyandark.dao.BookDao_1;
import cn.qingyandark.service.BookService_1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: qingyandark
 * Time: 2022-08-06 19:10:34
 * bean入门使用
 */

public class _1_IoC {
    public static void main(String[] args) {
        // 配置bean，详见配置文件applicationContext.xml

        // 获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("_1_bean_start.xml");

        // 获取bean
        BookDao_1 bookDao = (BookDao_1)ctx.getBean("bookDao");
        bookDao.save();

        BookService_1 bookService = (BookService_1) ctx.getBean("bookService3");
        bookService.save();
    }
}
