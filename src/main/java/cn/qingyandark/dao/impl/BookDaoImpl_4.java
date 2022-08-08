package cn.qingyandark.dao.impl;

import cn.qingyandark.dao.BookDao_4;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * User: qingyandark
 * Time: 2022-08-06 20:39:02
 * 初始化容器过程
 * 1. 创建对象
 * 2. 执行构造方法
 * 3. 执行属性注入（set）
 * 4. 执行bean初始化方法
 * 5. 容器关闭前才会触发bean的销毁操作
 */
public class BookDaoImpl_4 implements BookDao_4, InitializingBean, DisposableBean {
    @Override
    public void save() {
        System.out.println("BookDaoImpl_4 ......");
    }

//    自己实现 init和destory，生命周期函数
//    void init(){
//        System.out.println("bookdao_4 init .......");
//    }
//
//    void destory(){
//        System.out.println("bookdao_4 destory .......");
//    }

//    继承接口
    @Override
    public void destroy() throws Exception {
        System.out.println("BookDaoImpl_4 destory implements .......");
    }

    // 属性设置之后（就是自己的属性都设置好了以后）
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BookDaoImpl_4 init implements .......");
    }
}
