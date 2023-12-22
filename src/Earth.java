import java.awt.*;

public final class Earth implements Drawble{

    public void paintShape(Graphics2D g2d){

        g2d.setColor(Color.BLUE);
        g2d.fillOval(120,200,400, 400);

        g2d.setColor(Color.WHITE);
        g2d.fillOval(260, 580, 120, 20);

        g2d.setColor(Color.GREEN);
        g2d.fillOval(200, 300, 320, 170);
        g2d.fillOval(200, 400, 100, 150);

        g2d.setColor(Color.YELLOW);
        g2d.fillOval(300, 340, 170, 110);
        g2d.fillOval(210, 400, 80, 120);
        g2d.fillOval(380, 500, 80, 60);

        g2d.setColor(Color.GREEN);
        g2d.fillOval(120, 330, 50, 90);

        g2d.setColor(Color.GREEN);
        g2d.fillOval(130, 420, 50, 50);

        g2d.setColor(Color.GREEN);
        g2d.fillOval(260, 200, 120, 20);
    }


}
