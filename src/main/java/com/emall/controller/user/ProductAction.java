package com.emall.controller.user;

import com.emall.common.ServerResponse;
import com.emall.service.iservice.ProductService;
import com.emall.vo.ProductDetailVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zwc
 */

@Controller
@RequestMapping("/product/")
public class ProductAction {

    @Autowired
    private ProductService productService;

    @RequestMapping("list.do")
    public @ResponseBody ServerResponse<PageInfo> list(@RequestParam(value = "keyword",required = false)String keyword,
                                         @RequestParam(value = "categoryId",required = false)Integer categoryId,
                                         @RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                         @RequestParam(value = "pageSize",defaultValue = "10") int pageSize,
                                         @RequestParam(value = "orderBy",defaultValue = "") String orderBy){
        return productService.getProductByKeywordCategory(keyword,categoryId,pageNum,pageSize,orderBy);
    }

    @RequestMapping("detail.do")
    public @ResponseBody ServerResponse<ProductDetailVo> detail(Integer productId){
        return productService.getProductDetail(productId);
    }
}
