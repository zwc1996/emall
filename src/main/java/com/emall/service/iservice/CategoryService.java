package com.emall.service.iservice;

import com.emall.common.ServerResponse;
import com.emall.pojo.Category;

import java.util.List;

/**
 * Created by zwc
 */
public interface CategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);

}
