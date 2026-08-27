import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(10));

        g2.drawRect(50, 50, 200, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Square");
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Main());
        frame.setVisible(true);
    }
}
