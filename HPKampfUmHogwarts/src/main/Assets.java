package main;

import java.awt.image.BufferedImage;
import java.util.ArrayList;



public class Assets {
	
	private static final int width = 250, height = 250;
	
	public static ArrayList<BufferedImage> enemies;
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/Enemy/test.png"));
		
		enemies.add(sheet.crop(0, 0, width, height));
		enemies.add(sheet.crop(width, 0, width, height));
		enemies.add(sheet.crop(0, height, width, height));
		enemies.add(sheet.crop(width, height, width, height));
	}
	
}
