import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class Reminder
{
    private final int WIDTH = 900;
    private final int HEIGHT = 700;
    private Timer timer;
    private int x;
    private int y;
    private int counter;
    private Random random;
    private String[] messages = {
            "Dzień dobry",
            "Ahoj",
            "Hei hei",
            "Bonjour",
            "Hello"
    };
    private CustomPanel contentPane;

    private ActionListener timerAction = new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            if (counter == 5)
                counter = 0;
            x = random.nextInt(WIDTH);
            y = random.nextInt(HEIGHT);
            contentPane.setValues(x, y, messages[counter]);
            counter++;
        }
    };

    public Reminder()
    {
        counter = 0;
        x = y = 10;
        random = new Random();
    }
    private void displayGUI()
    {
        JFrame frame = new JFrame("Wyświetlanie tekstu co 5 sekund");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new CustomPanel(WIDTH, HEIGHT);

        frame.setContentPane(contentPane);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);

        timer = new Timer(2000, timerAction);
        timer.start();
    }
    public static void main(String... args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new Reminder().displayGUI();
            }
        });
    }
}
class CustomPanel extends JPanel
{
    private final int GAP = 10;
    private int width;
    private int height;
    private int x;
    private int y;
    private String message = "";

    public CustomPanel(int w, int h)
    {
        width = w;
        height = h;

        setOpaque(true);
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(GAP, GAP, GAP, GAP));
    }
    public void setValues(int x, int y, String msg)
    {
        this.x = x;
        this.y = y;
        message = msg;
        repaint();
    }
    public Dimension getPreferredSize()
    {
        return (new Dimension(width, height));
    }
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString(message, x, y);
    }
}