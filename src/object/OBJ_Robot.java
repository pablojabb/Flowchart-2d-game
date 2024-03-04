package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Robot extends SuperObject {

    public boolean on = false;

    public OBJ_Robot() {

        name = "Robot";

        try {

            if (on == false) {
                Image = ImageIO.read(getClass().getResourceAsStream("/resources/objects/cctvoff.png"));
            } else {
                Image = ImageIO.read(getClass().getResourceAsStream("/resources/objects/cctvon.png"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        collision = true;
        
    }

}
