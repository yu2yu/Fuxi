package com.yy.pattern.lichun.factoryMethod;

import com.yy.pattern.lichun.simpleFactory.Product;
import com.yy.pattern.lichun.simpleFactory.ProductA;
import com.yy.pattern.lichun.simpleFactory.ProductB;

/**
 * @author yy
 * @version 1.0.0
 * @Description 抽象工厂模式
 * @createTime 2022-05-27 22:21:00
 */
public interface Factory {

    public Product createProduct();
}
