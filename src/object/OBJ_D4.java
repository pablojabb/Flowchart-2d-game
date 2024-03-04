package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_D4 extends SuperObject{
    
     public boolean on = false;
     
     public OBJ_D4(){
         
          name = "D4";

        try {

            if (on == false) {
                Image = ImageIO.read(getClass().getResourceAsStream("/resources/objects/dc4.png"));
            } else {
                
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
         
     }
    
}
