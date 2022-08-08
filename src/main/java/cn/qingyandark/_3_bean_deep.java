package cn.qingyandark;

import cn.qingyandark.dao.BookDao_1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: qingyandark
 * Time: 2022-08-06 19:52:10
 * bean实例化研究
 * 1. 构造方法，spring会自动调用
 * 2. 静态工厂
 * 3. 实例工厂：大量技术通过这个同spring整合
 */
public class _3_bean_deep {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("_3_bean_deep.xml");

//        静态工厂
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("_1_bean_start.xml");
//        BookDao bookDao = (BookDao)ctx.getBean("bookDao");
//        bookDao.save();

//        实例工厂
//        BookDaoFactory2 bookDaoFactory2 = new BookDaoFactory2();
//        BookDao bookDao2 = bookDaoFactory2.getBookDao();
//        bookDao2.save();

//        BookDao bookDao4 = (BookDao)ctx.getBean("bookDao4");
//        bookDao4.save();

        BookDao_1 bookDao5 = (BookDao_1)ctx.getBean("bookDao5");
        bookDao5.save();
    }
}
