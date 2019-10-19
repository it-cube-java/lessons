package movement2;

import javax.swing.*;
import java.awt.*;

public class ButtonSquare extends JFrame {

    public ButtonSquare() throws InterruptedException {
        setTitle("Button Square");
        JButton button = new JButton();
        JPanel panel = new JPanel();

        panel.setLayout(null);
        button.setLayout(null);
        button.setBounds(0,0, 50,50);
        button.setBackground(Color.BLUE);

        panel.add(button);
        setContentPane(panel);
        setSize(800,800);
        setVisible(true);

        for(int i=0;i<70;i++){
            button.setBounds(button.getX()+10, button.getY(), 50,50);
            Thread.sleep(100);
        }
        for(int i=0;i<70;i++){
            button.setBounds(button.getX(), button.getY()+10, 50,50);
            Thread.sleep(100);
        }
        for(int i=0;i<70;i++){
            button.setBounds(button.getX()-10, button.getY(), 50,50);
            Thread.sleep(100);
        }
        for(int i=0;i<70;i++){
            button.setBounds(button.getX(), button.getY()-10, 50,50);
            Thread.sleep(100);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ButtonSquare();
    }
}
