package movement1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ButtonCraftWithRandom extends JFrame{

    public ButtonCraftWithRandom() throws InterruptedException {
        setTitle("Buttong Craft");
        JButton button = new JButton(" ");
        JPanel panel = new JPanel();

        panel.setLayout(null);
        button.setLayout(null);

        Random random = new Random();
        int x = random.nextInt(600);
        int y = random.nextInt(400);
        button.setBounds(x,y, 200,200);
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
        new ButtonCraftWithRandom();
    }
}
