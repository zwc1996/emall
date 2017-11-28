package com.emall.controller;

import com.emall.common.ResponseCode;
import com.emall.service.iservice.CartService;
import com.emall.vo.CartData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zwc on 2017/11/28.
 */
@Controller
@RequestMapping("cart")
public class CartAction {
    @Autowired
    CartService cartService;
    @RequestMapping(value = "getCartList.do",method = RequestMethod.GET)
    public @ResponseBody ResponseCode<CartData> getCartList(@RequestParam String username){
        return cartService.getCartList(username);
    }
}
