package com.emall.vo;

import java.math.BigDecimal;

/**
 * Created by zwc on 2017/11/28.
 */
public class CartProduct {
    private int id;
    private int userId;
    private int productId;
    private int quantity;
    private String productName;
    private String productSubtitle;
    private String productMainImage;
    private BigDecimal productPrice;
    private int productStatus;
    private BigDecimal productTotalPrice;
    private int productStock;
    private int productChecked;
    private String limitQuantity = "LIMIT_NUM_SUCCESS";

    public CartProduct(int id, int userId, int productId, int quantity, String productName, String productSubtitle, String productMainImage, BigDecimal productPrice, int productStatus, BigDecimal productToatalPrice, int productStock, int productChecked, String limitQuantity) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
        this.productName = productName;
        this.productSubtitle = productSubtitle;
        this.productMainImage = productMainImage;
        this.productPrice = productPrice;
        this.productStatus = productStatus;
        this.productTotalPrice = productTotalPrice;
        this.productStock = productStock;
        this.productChecked = productChecked;
        this.limitQuantity = limitQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductSubtitle() {
        return productSubtitle;
    }

    public void setProductSubtitle(String productSubtitle) {
        this.productSubtitle = productSubtitle;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductMainImage() {
        return productMainImage;
    }

    public void setProductMainImage(String productMainImage) {
        this.productMainImage = productMainImage;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }

    public BigDecimal getProductToatalPrice() {
        return productTotalPrice;
    }

    public void setProductToatalPrice(BigDecimal productToatalPrice) {
        this.productTotalPrice = productToatalPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public int getProductChecked() {
        return productChecked;
    }

    public void setProductChecked(int productChecked) {
        this.productChecked = productChecked;
    }

    public String getLimitQuantity() {
        return limitQuantity;
    }

    public void setLimitQuantity(String limitQuantity) {
        this.limitQuantity = limitQuantity;
    }

    public CartProduct() {
    }

    @Override
    public String toString() {
        return "cartProduct{" +
                "id=" + id +
                ", userId=" + userId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", productName='" + productName + '\'' +
                ", productSubtitle='" + productSubtitle + '\'' +
                ", productMainImage='" + productMainImage + '\'' +
                ", productPrice=" + productPrice +
                ", productStatus=" + productStatus +
                ", productToatalPrice=" + productTotalPrice +
                ", productStock=" + productStock +
                ", productChecked=" + productChecked +
                ", limitQuantity='" + limitQuantity + '\'' +
                '}';
    }
}
