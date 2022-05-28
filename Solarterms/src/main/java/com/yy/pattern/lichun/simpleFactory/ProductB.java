package com.yy.pattern.lichun.simpleFactory;

/**
 * @author yy
 * @version 1.0.0
 * @Description 具体的产品角色
 * @createTime 2022-05-27 22:24:00
 */
public class ProductB extends Product{


    @Override
    public String doWork() {
        // 一系列操作
        return "product B .....";
    }
}
