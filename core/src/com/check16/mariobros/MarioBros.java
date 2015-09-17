package com.check16.mariobros;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.check16.mariobros.screens.PlayScreen;

public class MarioBros extends Game {
	public static final int V_WIDTH = 400;
	public static final int V_HEIGHT = 208;
	public static final float PPM = 100;

	public static final short DEFAULT_BIT = 1;
	public static final short MARIO_BIT = 2;
	public static final short BRICK_BIT= 4;
	public static final short COIN_BIT = 8;
	public static final short DESTROYED_BIT = 16;


	public SpriteBatch sb;

	public static AssetManager manager;


	@Override
	public void create () {
		sb = new SpriteBatch();
		manager = new AssetManager();
		manager.load("audio/music/mario_music.ogg", Music.class);
		manager.load("audio/sounds/coin.wav", Music.class);
		manager.load("audio/sounds/bump.wav", Music.class);
		manager.load("audio/sounds/breakblock.wav", Music.class);
		manager.finishLoading();

		setScreen(new PlayScreen(this));

	}

	@Override
	public void render () {

		super.render();
	}
}
