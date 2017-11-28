package com.emall.service.impl;

import com.emall.common.ResponseCode;
import com.emall.common.Status;
import com.emall.dao.CartMapper;
import com.emall.pojo.Cart;
import com.emall.service.iservice.CartService;
import com.emall.vo.CartData;
import com.emall.vo.CartProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by zwc on 2017/11/28.
 */
@Service
public class CartImpl implements CartService {
    @Autowired
    CartMapper cartMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Cart record) {
        return 0;
    }

    @Override
    public int insertSelective(Cart record) {
        return 0;
    }

    @Override
    public Cart selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Cart record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Cart record) {
        return 0;
    }

    @Override
    public ResponseCode<CartData> getCartList(String username) {
        List<CartProduct> cartProductVoList = cartMapper.getCartList(username);
        BigDecimal totalprice = new BigDecimal(0.00);
        for(CartProduct cartProduct:cartProductVoList){
            totalprice = cartProduct.getProductToatalPrice().add(totalprice);
        }
        CartData cartData = new CartData(cartProductVoList,true,totalprice);
        return new ResponseCode<CartData>(Status.success.getIndex(),cartData);
    }
}
