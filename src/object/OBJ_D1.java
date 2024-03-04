package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_D1 extends SuperObject{
    
     public boolean on = false;
     
     public OBJ_D1(){
         
          name = "D1";

        try {

            if (on == false) {
                Image = ImageIO.read(getClass().getResourceAsStream("/resources/objects/dc1.png"));
            } else {
                Image = ImageIO.read(getClass().getResourceAsStream("/resources/objects/do1.png"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
         
     }
    
}
