package tile;

import Main.GamePanel;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import javax.imageio.ImageIO;

public class tileManager {

    GamePanel gp;
    public Tile[] tile;
    public int mapTileNum[][];

    public tileManager(GamePanel gp) {

        this.gp = gp;
        tile = new Tile[10];
        mapTileNum = new int[gp.maxScreenCol][gp.maxScreenRow];

        getTileImage();
        loadMap();
    }

    public void getTileImage() {

        try {

    

            tile[0] = new Tile();
            tile[0].Image = ImageIO.read(getClass().getResourceAsStream("/resources/tiles/m.png"));
            

            tile[1] = new Tile();
            tile[1].Image = ImageIO.read(getClass().getResourceAsStream("/resources/tiles/ful.png"));
            tile[1].collision = true;

            tile[2] = new Tile();
            tile[2].Image = ImageIO.read(getClass().getResourceAsStream("/resources/tiles/fum.png"));
            tile[2].collision = true;

            tile[3] = new Tile();
            tile[3].Image = ImageIO.read(getClass().getResourceAsStream("/resources/tiles/fur.png"));
            tile[3].collision = true;

            tile[4] = new Tile();
            tile[4].Image = ImageIO.read(getClass().getResourceAsStream("/resources/tiles/fml.png"));
            tile[4].collision = true;

            tile[5] = new Tile();
            tile[5].Image = ImageIO.read(getClass().getResourceAsStream("/resources/tiles/fmr.png"));
            tile[5].collision = true;

            tile[6] = new Tile();
            tile[6].Image = ImageIO.read(getClass().getResourceAsStream("/resources/tiles/fdl.png"));
            tile[6].collision = true;

            tile[7] = new Tile();
            tile[7].Image = ImageIO.read(getClass().getResourceAsStream("/resources/tiles/fdm.png"));
            tile[7].collision = true;

            tile[8] = new Tile();
            tile[8].Image = ImageIO.read(getClass().getResourceAsStream("/resources/tiles/fdr.png"));
            tile[8].collision = true;

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void loadMap() {

        try {

            InputStream in = getClass().getResourceAsStream("/resources/maps/map1.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            int col = 0;
            int row = 0;

            while (col < gp.maxScreenCol && row < gp.maxScreenRow) {

                String line = br.readLine();

                while (col < gp.maxScreenCol) {
                    String numbers[] = line.split(" ");

                    int num = Integer.parseInt(numbers[col]);

                    mapTileNum[col][row] = num;
                    col++;
                }
                if (col == gp.maxScreenCol) {
                    col = 0;
                    row++;
                }

            }
            br.close();

        } catch (Exception e) {
        }

    }

    public void draw(Graphics2D g2) {

        int col = 0;
        int row = 0;
        int x = 0;
        int y = 0;

        while (col < gp.maxScreenCol && row < gp.maxScreenRow) {

            int tileNum = mapTileNum[col][row];

            g2.drawImage(tile[tileNum].Image, x, y, gp.tileSize, gp.tileSize, null);
            col++;
            x += gp.tileSize;

            if (col == gp.maxScreenCol) {
                col = 0;
                x = 0;
                row++;
                y += gp.tileSize;
            }
        }

    }

}
