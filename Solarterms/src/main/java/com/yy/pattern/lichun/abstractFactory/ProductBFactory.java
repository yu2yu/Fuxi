package com.yy.pattern.lichun.abstractFactory;

import com.yy.pattern.lichun.simpleFactory.Product;
import com.yy.pattern.lichun.simpleFactory.ProductB;

/**
 * @author yy
 * @version 1.0.0
 * @Description 抽象组合工厂模式
 * @createTime 2022-05-27 22:21:00
 */
public class ProductBFactory implements Factory {

    @Override
    public Product createProduct() {
        return new ProductB();
    }
    @Override
    public Product2 createProduct2() {
        return new ProductB2();
    }
}
