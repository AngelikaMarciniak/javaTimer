import java.awt.*;
import java.awt.event.*;
public class Mouse extends Frame implements WindowListener, MouseListener
{
    String keymsg = "Naciśnij przycisk myszy aby wskazać miejsce wydruku tabliczki mnożenia";
    String s = "";
    int mouseX=30, mouseY=30;
    public Mouse() {
        this.addMouseListener(this);
        this.addWindowListener(this);
    }
    public void paint(Graphics g) {
        g.drawString(keymsg, 10, 40);
        g.drawString(s, mouseX, mouseY);
    }
    public static void main(String args[])
    {
        Mouse okienko = new Mouse();
        okienko.setSize(700, 500);
        okienko.setTitle("Tabliczka mnożenia");
        okienko.setVisible(true);

    }
    public void windowOpened(WindowEvent e) {
    }
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    public void windowClosed(WindowEvent e) {
    }
    public void windowIconified(WindowEvent e) {
    }
    public void windowDeiconified(WindowEvent e) {
    }
    public void windowActivated(WindowEvent e) {
    }
    public void windowDeactivated(WindowEvent e) {
    }
    public void mouseClicked(MouseEvent e) {

        int[][] tab = new int[11][11];
        String s = "";
        for ( int i = 1 ; i < 11 ; i++)
        {
            for (int j = 1 ; j <11 ; j++)
            {
                tab[i][j] = i*j; //wynik;
                s += "  "+tab[i][j]+"  ";
                if (j == 10)
                {
                    s += "\n";
                }
            }
        }
        TextArea tekst2 = new TextArea(s, 1000, 1100);
        this.setLayout(null);
        tekst2.setBounds(e.getX(),e.getY(),120,100);
        add(tekst2);
        repaint();
    }
    public void mousePressed(MouseEvent e) {
    }
    private void addWindowListener(MouseEvent e) {
    }
    public void mouseReleased(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {
    }
}