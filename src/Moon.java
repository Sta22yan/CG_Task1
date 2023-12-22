import java.awt.*;

public final class Moon implements Drawble{

    public void paintShape(Graphics2D g2d){

        g2d.setColor(Color.WHITE);
        g2d.fillOval(100,650,1000, 300);

        g2d.setColor(Color.LIGHT_GRAY);
        g2d.fillOval(200,750,100, 100);
        g2d.fillOval(330,675,75, 75);
        g2d.fillOval(370,775,175, 175);
        g2d.fillOval(490,670,105, 105);
        g2d.fillOval(645,710,80, 80);
    }

}
