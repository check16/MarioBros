package com.check16.mariobros.sprites.tileObjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.maps.tiled.TiledMapTileSet;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.check16.mariobros.MarioBros;
import com.check16.mariobros.scenes.Hud;
import com.check16.mariobros.screens.PlayScreen;
import com.check16.mariobros.sprites.items.ItemDef;
import com.check16.mariobros.sprites.items.Mushroom;
import com.check16.mariobros.sprites.tileObjects.InteractiveTileObject;

/**
 * Created by Antonio on 05/09/2015.
 */
public class Coin extends InteractiveTileObject {

    private static TiledMapTileSet tileSet;
    private final int BLANK_COIN = 28;

    public Coin(PlayScreen screen, Rectangle bounds) {
        super(screen, bounds);
        tileSet = map.getTileSets().getTileSet("tileset_gutter");
        fixture.setUserData(this);
        setCategoryFilter(MarioBros.COIN_BIT);
    }

    public void onHeadHit() {
        Gdx.app.log("Coin", "Collision");
        if(getCell().getTile().getId() == BLANK_COIN)
            MarioBros.manager.get("audio/sounds/bump.wav", Music.class).play();
        else {
            MarioBros.manager.get("audio/sounds/coin.wav", Music.class).play();
            screen.spawnItem(new ItemDef(new Vector2(body.getPosition().x, body.getPosition().y + 16 / MarioBros.PPM), Mushroom.class));
        }
        getCell().setTile(tileSet.getTile(BLANK_COIN));
        Hud.addScore(100);


    }
}
