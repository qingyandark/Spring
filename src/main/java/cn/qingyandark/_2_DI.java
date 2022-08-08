package cn.qingyandark;

import cn.qingyandark.service.BookService_1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _2_DI {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("_1_bean_start.xml");
        BookService_1 bookService = (BookService_1) ctx.getBean("bookService");
        bookService.save();
    }
}
