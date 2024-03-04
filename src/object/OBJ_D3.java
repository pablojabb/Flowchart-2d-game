package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_D3 extends SuperObject{
    
     public boolean on = false;
     
     public OBJ_D3(){
         
          name = "D3";

        try {

            if (on == false) {
                Image = ImageIO.read(getClass().getResourceAsStream("/resources/objects/dc3.png"));
            } else {
                Image = ImageIO.read(getClass().getResourceAsStream("/resources/objects/do3.png"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
         
     }
    
}
