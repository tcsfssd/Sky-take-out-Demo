package com.sky.mapper;

import com.sky.entity.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: IT-ztc
 * @DATE: 2023/8/26
 * @PROJECT_NAME: sky-take-out
 **/
@Mapper
public interface ShoppingCartMapper {

    /**
     * 条件查询
     *
     * @param shoppingCart
     * @return
     */
    List<ShoppingCart> list(ShoppingCart shoppingCart);
}
