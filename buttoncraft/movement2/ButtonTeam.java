package movement2;

import javax.swing.*;
import java.awt.*;

public class ButtonTeam extends JFrame {

    public ButtonTeam() throws InterruptedException {
        setTitle("Button Team");
        JButton button = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JPanel panel = new JPanel();

        panel.setLayout(null);
        button.setLayout(null);
        button2.setLayout(null);
        button3.setLayout(null);

        button.setBounds(0,0, 50,50);
        button2.setBounds(0,100, 50,50);
        button3.setBounds(0,200, 50,50);

        button.setBackground(Color.BLUE);
        button2.setBackground(Color.RED);
        button3.setBackground(Color.GREEN);

        panel.add(button);
        panel.add(button2);
        panel.add(button3);

        setContentPane(panel);
        setSize(800,800);
        setVisible(true);

        for(int i=0;i<70;i++){
            button.setBounds(button.getX()+10, button.getY(), 50,50);
            button2.setBounds(button2.getX()+10, button2.getY(), 50,50);
            button3.setBounds(button3.getX()+10, button3.getY(), 50,50);
            Thread.sleep(100);
        }
        for(int i=0;i<70;i++){
            button.setBounds(button.getX()-10, button.getY(), 50,50);
            button2.setBounds(button2.getX()-10, button2.getY(), 50,50);
            button3.setBounds(button3.getX()-10, button3.getY(), 50,50);
            Thread.sleep(100);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ButtonTeam();
    }
}
