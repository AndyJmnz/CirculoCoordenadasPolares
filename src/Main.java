import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int x, y;
        int xc = 200, yc = 200, R = 50;
        double t;

        // Dibujar un círculo con el método drawLine simulando píxeles
        for (t = 0; t <= 360; t++) {
            x = (int) (xc + R * Math.sin(Math.toRadians(t)));
            y = (int) (yc + R * Math.cos(Math.toRadians(t)));
            g.drawLine(x, y, x, y);  // Dibujar un "píxel" con drawLine
        }

        // Llamar a otro método para dibujar otro círculo
        drawCircle(g, 0, 0, 200, 200, 75, 0);
    }

    // Método para dibujar un círculo
    public void drawCircle(Graphics g, int x, int y, int xc, int yc, int R, double t) {
        for (int i = 0; i <= 360; i++) {
            t = Math.toRadians(i);
            x = (int) (xc + R * Math.sin(t));
            y = (int) (yc + R * Math.cos(t));
            g.drawLine(x, y, x, y);  // Dibujar un "píxel"
        }
    }

    // Método principal
    public static void main(String[] args) {
        Main frame = new Main();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
