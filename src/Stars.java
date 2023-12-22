import java.awt.*;
import java.util.Random;

public final class Stars implements Drawble{

    public void paintShape(Graphics2D g2d){

        Random random = new Random();

        for(int i = 0; i < 200; i++){

            int col = random.nextInt(3);
            switch (col) {
                case 0 -> g2d.setColor(Color.YELLOW);
                case 1 -> g2d.setColor(Color.ORANGE);
                case 2 -> g2d.setColor(Color.CYAN);
            }

            int x = random.nextInt(760) + 40;
            int y = random.nextInt(760) + 40;

            g2d.drawLine(x, y, x + 5, y + 5);
            g2d.drawLine(x, y + 5, x + 5, y);
        }

    }

}
