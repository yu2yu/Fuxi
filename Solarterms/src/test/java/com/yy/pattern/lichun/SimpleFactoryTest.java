package com.yy.pattern.lichun;

import com.yy.pattern.lichun.simpleFactory.Product;
import com.yy.pattern.lichun.simpleFactory.SimpleFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author yy
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022-05-28 10:02:00
 */
public class SimpleFactoryTest {


    @Test
    @DisplayName("简单工厂模式")
    public void testSimpleFactory(){
        SimpleFactory simpleFactory = new SimpleFactory();
        Product a = simpleFactory.createProduct("A");
        assertEquals("product A .....",a.doWork());
    }

}
