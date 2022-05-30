package com.yy.pattern.lichun;

import com.yy.pattern.lichun.factoryMethod.Factory;
import com.yy.pattern.lichun.factoryMethod.ProductAFactory;
import com.yy.pattern.lichun.factoryMethod.ProductBFactory;
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
public class FactoryMethodTest {


    @Test
    @DisplayName("工厂方法模式")
    public void testSimpleFactory(){
        Factory factoryA = new ProductAFactory();
        Product a = factoryA.createProduct();
        assertEquals("product A .....",a.doWork());


        Factory factoryB = new ProductBFactory();
        Product b = factoryB.createProduct();
        assertEquals("product B .....",b.doWork());
    }

}
