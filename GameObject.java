package hack2018;

import java.awt.image.BufferedImage;

public interface GameObject {
	int objId = 0;
	int xCord = 0;
	int yCord = 0;
	Object imgSprite = null;
	//BufferedImage img = null;
	public void draw();
}
