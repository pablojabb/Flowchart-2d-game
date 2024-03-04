package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_D2 extends SuperObject{
    
     public boolean on = false;
     
     public OBJ_D2(){
         
          name = "D2";

        try {

            if (on == false) {
                Image = ImageIO.read(getClass().getResourceAsStream("/resources/objects/dc2.png"));
            } else {
                Image = ImageIO.read(getClass().getResourceAsStream("/resources/objects/do2.png"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
         
     }
    
}
