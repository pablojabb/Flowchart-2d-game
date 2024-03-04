package Main;

import entity.Player;
import static java.awt.Color.black;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import object.SuperObject;
import tile.tileManager;

public class GamePanel extends JPanel implements Runnable {

    //Screen settings
    final int originalTileSize = 16; //16 by 16 tile
    final int scale = 3;
    final int FPS = 60;

    public final int tileSize = originalTileSize * scale; //48 by 48 tile
    public final int maxScreenCol = 16;
    public final int maxScreenRow = 12;
    public final int screenWidth = tileSize * maxScreenCol;  //768
    public final int screenHeight = tileSize * maxScreenRow; //576

    tileManager tileM = new tileManager(this);
    KeyHandler keyH = new KeyHandler();
    Thread gameThread;
//    public CollisionChecker cChecker = new CollisionChecker(this);
    public AssetSetter Asetter = new AssetSetter(this);
    Player player = new Player(this, keyH);
    public SuperObject obj[] = new SuperObject[10];
    

    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }

    public void setUpGame(){
        Asetter.setObject();
    }
    
    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();

    }

    @Override
    public void run() {

        double drawInterval = 1000000000 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null) {

            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if (delta >= 1) {
                update();
                repaint();
                delta--;
            }

        }
    }

    public void update() {

        player.update();

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        tileM.draw(g2);
        
        for(int i = 0;i < obj.length; i++ ){
            if(obj[i] != null){
                obj[i].draw(g2, this,i);
                
            }
        }
        player.draw(g2);

        g2.dispose();
    }

}
