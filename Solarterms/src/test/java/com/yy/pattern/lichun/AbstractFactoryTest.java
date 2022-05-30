package com.yy.pattern.lichun;

import com.yy.pattern.lichun.abstractFactory.Factory;
import com.yy.pattern.lichun.abstractFactory.Product2;
import com.yy.pattern.lichun.abstractFactory.ProductAFactory;
import com.yy.pattern.lichun.abstractFactory.ProductBFactory;
import com.yy.pattern.lichun.simpleFactory.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author yy
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022-05-28 10:02:00
 */
public class AbstractFactoryTest {


    @Test
    @DisplayName("抽象工厂模式")
    public void testSimpleFactory(){
        Factory factoryA = new ProductAFactory();
        Product a = factoryA.createProduct();
        Product2 a2 = factoryA.createProduct2();


        Factory factoryB = new ProductBFactory();
        Product b = factoryB.createProduct();
        Product2 b2 = factoryB.createProduct2();
    }

}
