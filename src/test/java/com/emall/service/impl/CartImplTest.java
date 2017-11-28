package com.emall.service.impl;

import com.emall.service.iservice.CartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by zwc on 2017/11/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class CartImplTest {
    @Resource
    private CartService cartService;
    @Test
    public void testGetCartList() throws Exception {
        System.out.println(cartService.getCartList("scott"));
    }
}