package cn.qingyandark;

import cn.qingyandark.dao.BookDao_4;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: qingyandark
 * Time: 2022-08-06 19:52:10
 * bean 生命周期研究
 */
public class _4_bean_lifetime {
    public static void main(String[] args) {
        // 注意
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("_4_bean_lifetime.xml");
//        BookDao bookDao = (BookDao)ctx.getBean("bookDao_4");
        BookDao_4 bookDao = (BookDao_4)ctx.getBean("bookDao_4_2");
        bookDao.save();
        // destory方法的执行需要关闭容器
        // 暴力关闭容器
        // ctx.close();

        // 关机钩子，虚拟机关闭前，先关闭容器
        ctx.registerShutdownHook();

    }
}