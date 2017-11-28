package com.emall.service.iservice;

import com.emall.common.ResponseCode;
import com.emall.pojo.Cart;
import com.emall.vo.CartData;

/**
 * Created by zwc on 2017/11/28.
 */
public interface CartService {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    ResponseCode<CartData> getCartList(String username);
}
