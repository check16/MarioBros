package com.check16.mariobros.sprites.tileObjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.math.Rectangle;
import com.check16.mariobros.MarioBros;
import com.check16.mariobros.scenes.Hud;
import com.check16.mariobros.screens.PlayScreen;
import com.check16.mariobros.sprites.tileObjects.InteractiveTileObject;

/**
 * Created by Antonio on 05/09/2015.
 */
public class Brick extends InteractiveTileObject {

    public Brick(PlayScreen screen, Rectangle bounds) {

        super(screen, bounds);
        fixture.setUserData(this);
        setCategoryFilter(MarioBros.BRICK_BIT);
    }

    public void onHeadHit() {
        Gdx.app.log("Brick", "Collision");
        setCategoryFilter(MarioBros.DESTROYED_BIT);
        getCell().setTile(null);
        Hud.addScore(200);

        MarioBros.manager.get("audio/sounds/breakblock.wav", Music.class).play();

        System.out.println("Posicion: " + ((int)(body.getPosition().x * MarioBros.PPM / 16)) + ", " + (int)(body.getPosition().y * MarioBros.PPM / 16));
    }

}
