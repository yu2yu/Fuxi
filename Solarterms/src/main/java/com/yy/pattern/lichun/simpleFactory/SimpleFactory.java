package com.yy.pattern.lichun.simpleFactory;

import com.yy.pattern.lichun.simpleFactory.Product;
import com.yy.pattern.lichun.simpleFactory.ProductA;
import com.yy.pattern.lichun.simpleFactory.ProductB;

/**
 * @author yy
 * @version 1.0.0
 * @Description 简单工厂模式
 * @createTime 2022-05-27 22:21:00
 */
public class SimpleFactory {


    public Product createProduct(String productName){

        Product product = null;

        switch (productName){
            case "A":
                product = new ProductA();
                break;
            case "B":
                product = new ProductB();
                break;
            default:
                break;
        }

        return product;
    }
}
