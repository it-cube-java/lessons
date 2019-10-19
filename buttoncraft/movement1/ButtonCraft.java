package movement1;

import javax.swing.*;
import java.awt.*;

public class ButtonCraft extends JFrame {

    public ButtonCraft() throws InterruptedException {
        setTitle("Buttong Craft");
        JButton button = new JButton(" ");
        JPanel panel = new JPanel();

        panel.setLayout(null);
        button.setLayout(null);
        button.setBounds(100,100, 200,200);
        button.setBackground(Color.BLUE);

        panel.add(button);
        setContentPane(panel);
        setSize(800,600);
        setVisible(true);

        for(int i=0;i<100;i++){
            button.setBounds(button.getX(), button.getY()+10, 200,200);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ButtonCraft();
    }
}
