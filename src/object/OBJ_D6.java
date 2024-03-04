package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_D6 extends SuperObject{
    
     public boolean on = false;
     
     public OBJ_D6(){
         
          name = "D6";

        try {

            if (on == false) {
                Image = ImageIO.read(getClass().getResourceAsStream("/resources/objects/dc6.png"));
            } else {
                Image = ImageIO.read(getClass().getResourceAsStream("/resources/objects/do6.png"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
         
     }
    
}
