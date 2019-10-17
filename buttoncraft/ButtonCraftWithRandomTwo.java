import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ButtonCraftWithRandomTwo extends JFrame {
    public ButtonCraftWithRandomTwo() throws InterruptedException {
        setTitle("Buttong Craft");
        JButton button = new JButton(" ");
        JButton button2 = new JButton(" ");
        JPanel panel = new JPanel();

        panel.setLayout(null);
        button.setLayout(null);
        button2.setLayout(null);

        Random random = new Random();
        int x = random.nextInt(600);
        int y = random.nextInt(400);
        button.setBounds(x,y, 200,200);
        button.setBackground(Color.BLUE);

        int x2 = random.nextInt(600);
        int y2 = random.nextInt(400);
        int d = random.nextInt(2) + 1;
        button2.setBounds(x2,y2, 20*d,20*d);
        button2.setBackground(Color.green);

        panel.add(button);
        panel.add(button2);
        setContentPane(panel);
        setSize(800,600);
        setVisible(true);

        for(int i=0;i<100;i++){
            button.setBounds(button.getX(), button.getY()+10, 200,200);
            button2.setBounds(button2.getX(), button2.getY() +15, button2.getWidth()+20, button2.getHeight()+20);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ButtonCraftWithRandomTwo();
    }
}

