package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: IT-ztc
 * @DATE: 2023/8/26
 * @PROJECT_NAME: sky-take-out
 **/
@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id查询对应的套餐id
     * @param dishIds
     * @return
     */
    //select setmeal id from setmeal_dish where dish_id in (dishIds)
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}
