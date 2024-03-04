package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_D5 extends SuperObject{
    
     public boolean on = false;
     
     public OBJ_D5(){
         
          name = "D5";

        try {

            if (on == false) {
                Image = ImageIO.read(getClass().getResourceAsStream("/resources/objects/dc5.png"));
            } else {
                Image = ImageIO.read(getClass().getResourceAsStream("/resources/objects/do5.png"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
         
     }
    
}
