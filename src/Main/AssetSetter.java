package Main;

import object.OBJ_Button;
import object.OBJ_D1;
import object.OBJ_D2;
import object.OBJ_D3;
import object.OBJ_D4;
import object.OBJ_D5;
import object.OBJ_D6;
import object.OBJ_Robot;

public class AssetSetter {

    GamePanel gp;

    public AssetSetter(GamePanel gp) {

        this.gp = gp;

    }

    public void setObject() {

        gp.obj[0] = new OBJ_Button();
        gp.obj[0].mapX = 520;
        gp.obj[0].mapY = -10;
        
        gp.obj[1] = new OBJ_D1();
        gp.obj[1].mapX = -15;
        gp.obj[1].mapY = 6 * gp.tileSize;
        
        gp.obj[2] = new OBJ_D2();
        gp.obj[2].mapX = -15;
        gp.obj[2].mapY = 7 * gp.tileSize;
        
        gp.obj[3] = new OBJ_D3();
        gp.obj[3].mapX = -15;
        gp.obj[3].mapY = 8 * gp.tileSize;
        
        gp.obj[4] = new OBJ_D4();
        gp.obj[4].mapX = -15;
        gp.obj[4].mapY =  9 * gp.tileSize;
        
        gp.obj[5] = new OBJ_D5();
        gp.obj[5].mapX = -15;
        gp.obj[5].mapY = 10 * gp.tileSize;
        
        
        gp.obj[6] = new OBJ_Robot();
        gp.obj[6].mapX = 15 * gp.tileSize;
        gp.obj[6].mapY = 30;
        
        
   

    }

}
