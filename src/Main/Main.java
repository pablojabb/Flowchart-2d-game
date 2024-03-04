package Main;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {
        
         FlatLaf.registerCustomDefaultsSource("theme");
        FlatIntelliJLaf.setup();
        
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("GAME NAME");
        
        GamePanel gamePanel = new GamePanel();
        Side side = new Side();
        
        
       // Create a container to hold both panels
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(gamePanel, BorderLayout.CENTER); // Add game panel to center
        mainPanel.add(side, BorderLayout.EAST);   // Add side panel to the right

        window.add(mainPanel);
        
        
        window.pack();
        
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        gamePanel.setUpGame();
        gamePanel.startGameThread();
        
    }

}
