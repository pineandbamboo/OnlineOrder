package com.laioffer.onlineorder.model;

import com.laioffer.onlineorder.entity.MenuItemEntity;

public record MenuItemDto(
        Long id,
        String name,
        String description,
        Double price,
        String imageUrl
) {
    public MenuItemDto (MenuItemEntity menuItemEntity) {
        this(
                menuItemEntity.id(),
                menuItemEntity.name(),
                menuItemEntity.description(),
                menuItemEntity.price(),
                menuItemEntity.imageUrl()
        );
    }
}

