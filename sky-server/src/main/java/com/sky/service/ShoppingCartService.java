package com.sky.service;

import com.sky.dto.ShoppingCartDTO;

/**
 * @Author: IT-ztc
 * @DATE: 2023/8/29
 * @PROJECT_NAME: sky-take-out
 **/
public interface ShoppingCartService {

    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShopingCart(ShoppingCartDTO shoppingCartDTO);
}
