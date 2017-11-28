package com.emall.vo;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by zwc on 2017/11/28.
 */
public class CartData {
    private List<CartProduct> cartProductVoList;
    private Boolean allChecked;
    private BigDecimal cartTotalPrice;

    public CartData(List<CartProduct> cartProductVoList, Boolean allChecked, BigDecimal cartTotalPrice) {
        this.cartProductVoList = cartProductVoList;
        this.allChecked = allChecked;
        this.cartTotalPrice = cartTotalPrice;
    }

    public CartData() {
    }

    public List<CartProduct> getCartProductVoList() {
        return cartProductVoList;
    }

    public void setCartProductVoList(List<CartProduct> cartProductVoList) {
        this.cartProductVoList = cartProductVoList;
    }

    public Boolean getAllChecked() {
        return allChecked;
    }

    public void setAllChecked(Boolean allChecked) {
        this.allChecked = allChecked;
    }

    public BigDecimal getCartTotalPrice() {
        return cartTotalPrice;
    }

    public void setCartTotalPrice(BigDecimal cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }

    @Override
    public String toString() {
        return "CartData{" +
                "cartProductVoList=" + cartProductVoList +
                ", allChecked=" + allChecked +
                ", cartTotalPrice=" + cartTotalPrice +
                '}';
    }
}
