package com.yy.pattern.lichun.abstractFactory;

import com.yy.pattern.lichun.simpleFactory.Product;

/**
 * @author yy
 * @version 1.0.0
 * @Description 抽象工厂模式
 * @createTime 2022-05-27 22:21:00
 */
public interface Factory {

    public Product createProduct();
    public Product2 createProduct2();
}
