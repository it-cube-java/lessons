package random;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ButtonTeleport extends JFrame {

    public ButtonTeleport() throws InterruptedException {
        setTitle("Buttong Teleport");
        JButton button = new JButton();
        JPanel panel = new JPanel();
        panel.setLayout(null);
        button.setLayout(null);
        button.setBackground(Color.magenta);
        panel.add(button);
        setContentPane(panel);
        setSize(800,600);
        setVisible(true);

        Random random = new Random();
        int x = random.nextInt(600);
        int y = random.nextInt(400);

        button.setBounds(x,y, 50,50);
        Thread.sleep(1000);

        for(;;){
           x = random.nextInt(750);
           y = random.nextInt(550);
           button.setBounds(x,y, 50,50);
           Thread.sleep(500);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        new ButtonTeleport();
    }
}
