package cn.qingyandark;

import cn.qingyandark.config.SpringConfig;
import cn.qingyandark.dao.BookDao_1;
import cn.qingyandark.service.impl.BookServiceImpl_1;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.List;

public class teset {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookServiceImpl_1 bean = ctx.getBean(BookServiceImpl_1.class);
        List<BookDao_1> bookDao_1s = bean.seleceAll();
        System.out.println(bookDao_1s);
    }
}
