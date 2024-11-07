package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * Description: 新增菜品和对应的口味
 *
 * @Author 张恒
 * @Version
 */
public interface DishService {
    public void saveWithFlavor(DishDTO dishDTO);
}
