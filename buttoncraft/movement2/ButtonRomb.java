package movement2;

import javax.swing.*;
import java.awt.*;

public class ButtonRomb extends JFrame {

    public ButtonRomb() throws InterruptedException {
        setTitle("Button Romb");
        JButton button = new JButton();
        JPanel panel = new JPanel();

        panel.setLayout(null);
        button.setLayout(null);
        button.setBounds(0,350, 50,50);
        button.setBackground(Color.BLUE);

        panel.add(button);
        setContentPane(panel);
        setSize(800,800);
        setVisible(true);

        for(int i=0;i<35;i++){
            button.setBounds(button.getX()+10, button.getY()-10, 50,50);
            Thread.sleep(100);
        }
        for(int i=0;i<35;i++){
            button.setBounds(button.getX()+10, button.getY()+10, 50,50);
            Thread.sleep(100);
        }
        for(int i=0;i<35;i++){
            button.setBounds(button.getX()-10, button.getY()+10, 50,50);
            Thread.sleep(100);
        }
        for(int i=0;i<35;i++){
            button.setBounds(button.getX()-10, button.getY()-10, 50,50);
            Thread.sleep(100);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ButtonRomb();
    }
}