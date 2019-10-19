package movement2;

import javax.swing.*;
import java.awt.*;

public class ButtonBiggerAndSmaller extends JFrame {

    public ButtonBiggerAndSmaller() throws InterruptedException {
        setTitle("Button Bigger And Smaller");
        JButton button = new JButton();
        JPanel panel = new JPanel();

        panel.setLayout(null);
        button.setLayout(null);
        button.setBounds(0,350, 10,10);
        button.setBackground(Color.BLUE);

        panel.add(button);
        setContentPane(panel);
        setSize(800,800);
        setVisible(true);

        for(int i=0;i<10;i++){
            button.setBounds(button.getX()+10, button.getY()-10, button.getWidth()*2,button.getHeight()*2);
            Thread.sleep(100);
        }
        for(int i=0;i<10;i++){
            button.setBounds(button.getX()-10, button.getY()-10, button.getWidth()/2,button.getHeight()/2);
            Thread.sleep(100);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ButtonBiggerAndSmaller();
    }
}