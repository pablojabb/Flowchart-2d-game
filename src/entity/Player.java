package entity;

import Main.GamePanel;
import Main.KeyHandler;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Player extends entity {

    GamePanel gp;
    KeyHandler keyH;

    public Player(GamePanel gp, KeyHandler keyH) {

        this.gp = gp;
        this.keyH = keyH;

        solidArea = new Rectangle(24, 46, 2, 2);
        
        solidAreaDefaultX =  24;
        solidAreaDefaultY = 46;
        
        SetDefaultValues();
        getPlayerImage();

    }

    public void SetDefaultValues() {

        screenX = 100;
        screenY = 100;
        speed = 4;
        direction = "down";

    }

    public void getPlayerImage() {

        try {

            up1 = ImageIO.read(getClass().getResourceAsStream("/resources/player/up1.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/resources/player/up2.png"));
            up3 = ImageIO.read(getClass().getResourceAsStream("/resources/player/up2.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("/resources/player/down1.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/resources/player/down2.png"));
            down3 = ImageIO.read(getClass().getResourceAsStream("/resources/player/down3.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/resources/player/left1.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/resources/player/left2.png"));
            left3 = ImageIO.read(getClass().getResourceAsStream("/resources/player/left3.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/resources/player/right1.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/resources/player/right2.png"));
            right3 = ImageIO.read(getClass().getResourceAsStream("/resources/player/right3.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void update() {

        if (keyH.upPressed || keyH.downPressed || keyH.leftPressed || keyH.rightPressed) {

            if (keyH.upPressed == true) {
                direction = "up";

            } else if (keyH.downPressed == true) {
                direction = "down";

            } else if (keyH.leftPressed == true) {
                direction = "left";

            } else if (keyH.rightPressed == true) {
                direction = "right";

            }
            
            //check tile collision
            collisionOn = false;
//            gp.cChecker.checkTile(this);
            
            //object check collision
//            int objectIndex = gp.cChecker.checkObject(this, true);
            

            if (collisionOn == false) {

                switch (direction) {
                    case "up":
                        y -= speed;
                        break;

                    case "down":
                        y += speed;
                        break;

                    case "left":
                        x -= speed;
                        break;

                    case "right":
                        x += speed;
                        break;

                }
            }

            spriteCounter++;
            if (spriteCounter > 10) {
                if (spriteNum == 1) {
                    spriteNum = 2;
                } else if (spriteNum == 2) {
                    spriteNum = 3;
                } else if (spriteNum == 3) {
                    spriteNum = 1;
                }
                spriteCounter = 0;
            }

        }

    }

    public void draw(Graphics2D g2) {

//        g2.setColor(Color.WHITE);
//        g2.fillRect(x, y, gp.tileSize, gp.tileSize);
        BufferedImage image = null;

        switch (direction) {

            case "up":
                if (spriteNum == 1) {
                    image = up1;
                }
                if (spriteNum == 2) {
                    image = up2;
                }
                if (spriteNum == 3) {
                    image = up3;
                }

                break;

            case "down":
                if (spriteNum == 1) {
                    image = down1;
                }
                if (spriteNum == 2) {
                    image = down2;
                }
                if (spriteNum == 3) {
                    image = down3;
                }
                break;

            case "left":
                if (spriteNum == 1) {
                    image = left1;
                }
                if (spriteNum == 2) {
                    image = left2;
                }
                if (spriteNum == 3) {
                    image = left3;
                }
                break;

            case "right":
                if (spriteNum == 1) {
                    image = right1;
                }
                if (spriteNum == 2) {
                    image = right2;
                }
                if (spriteNum == 3) {
                    image = right3;
                }
                break;

        }
        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);

    }
}
