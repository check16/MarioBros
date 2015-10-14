package com.check16.mariobros.sprites.items;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by anton on 14/10/2015.
 */
public class ItemDef {
    public Vector2 position;
    public Class<?> type;

    public ItemDef(Vector2 position, Class<?> type) {
        this.position = position;
        this.type = type;
    }
}
