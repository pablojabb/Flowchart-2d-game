package object;

import java.awt.Rectangle;
import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Button extends SuperObject {

    public boolean on = false;

    public OBJ_Button() {

        name = "Button";
        solidArea = new Rectangle(80,80,48,48);
                
        try {

            if (on == false) {
                Image = ImageIO.read(getClass().getResourceAsStream("/resources/objects/bof.png"));
            } else {
                Image = ImageIO.read(getClass().getResourceAsStream("/resources/objects/bon.png"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
