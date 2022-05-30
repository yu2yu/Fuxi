package com.yy.pattern.lichun.abstractFactory;

import com.yy.pattern.lichun.simpleFactory.Product;

/**
 * @author yy
 * @version 1.0.0
 * @Description 具体的产品角色
 * @createTime 2022-05-27 22:24:00
 */
public class ProductB2 extends Product2 {


    @Override
    public String doLife() {
        // 一系列操作
        return "product B2 .....";
    }
}
