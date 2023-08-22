package main;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.time.Clock;

public class GameWindow{
    private JFrame jFrame;
    public GameWindow(GamePanel gamePanel){

        jFrame = new JFrame();

        jFrame.setSize(600, 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(gamePanel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                gamePanel.getGame().windowFocusLost();
            }

            @Override
            public void windowLostFocus(WindowEvent e) {

            }
        });

//        jFrame= new JFrame();
//        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE );
//        jFrame.add(gamePanel);
//        jFrame.setLocationRelativeTo(null);
//        jFrame.setResizable(false);
//        jFrame.pack();
//        jFrame.setVisible(true);
    }
}
