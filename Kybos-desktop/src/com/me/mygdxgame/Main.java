package com.me.mygdxgame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Kybos";
		cfg.useGL20 = false;
		cfg.width = 800;
		cfg.height = 480;//aleksya was here
		
		new LwjglApplication(new MyGdxGame(), cfg);
	}
}
