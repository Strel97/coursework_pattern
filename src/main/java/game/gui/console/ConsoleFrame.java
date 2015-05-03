package game.gui.console;

import javax.swing.*;
import java.awt.*;

/**
 * Created by sergey on 27.04.2015.
 */
public class ConsoleFrame extends JFrame {

    private JPanel canvas;


    public ConsoleFrame(String title, int width, int height) {
        super(title);

        setPreferredSize(new Dimension(width, height));
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        canvas = new JPanel();
        setContentPane(canvas);
    }

    public void showFrame() {
        setVisible(true);
    }


    public static void main(String[] args) {
        ConsoleFrame frame = new ConsoleFrame("Beyond Darkness", 600, 600);
        frame.showFrame();
    }
}
