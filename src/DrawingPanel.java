import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public final class DrawingPanel extends JFrame {

    private final int BACKGROUND_WIDTH = 800;
    private final int BACKGROUND_HEIGHT = 800;

    public DrawingPanel(){
        setTitle("Drawing panel");
        setSize(BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBackground(Color.black);

    }

    @Override
    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        List<Drawble> drawbleList = new ArrayList<>(List.of(new Stars(), new Earth(), new Moon(), new Flag()));
        for(Drawble drawble : drawbleList){
            drawble.paintShape(g2d);
        }
    }
}
