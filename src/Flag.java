import java.awt.*;

public final class Flag implements Drawble{

    public void paintShape(Graphics2D g2d){

        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRect(420,600,10, 150);

        g2d.setColor(Color.RED);
        g2d.fillArc(430, 400, 100, 400, 180, 10);
    }

}
