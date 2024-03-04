package object;

import Main.GamePanel;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class SuperObject {

    public BufferedImage Image;
    public String name;
    public boolean collision = false;
    public int mapX, mapY;
    public Rectangle solidArea = new Rectangle(0,0,48,48);
    public int solidAreaDefaultX = 0;
    public int solidAreaDefaultY = 0;

    public void draw(Graphics2D g2, GamePanel gp, int i) {

        g2.drawImage(Image, gp.obj[i].mapX, gp.obj[i].mapY, gp.tileSize, gp.tileSize, null);
        
    }

}
