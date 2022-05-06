import java.awt.*;
import java.awt.event.*;
public class Keyboard extends Frame implements WindowListener, MouseListener, KeyListener {

    String keymsg = "Kliknij w dowolne miejsce na ekranie a tam pojawi sie pole tekstowe";
    Label l;
    TextArea area;
    public Keyboard() {

        this.addKeyListener(this);
        this.addMouseListener(this);
        this.addWindowListener(this);
    }
    public void paint(Graphics g) {
        g.drawString(keymsg, 10, 40);
    }
    public static void main(String args[])
    {
        Keyboard okienko = new Keyboard();
        okienko.setSize(400, 400);
        okienko.setTitle("Aplikacja z polem tekstowym");
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

        l=new Label();
        l.setBounds(20,50,100,20);
        area=new TextArea();
        area.setBounds(e.getX(),e.getY(),100, 100);
        area.addKeyListener(this);

        add(l);add(area);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public void mousePressed(MouseEvent e) {
    }
    public void mouseReleased(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e) {

    }
    public void mouseExited(MouseEvent e) {
    }
    public void keyTyped(KeyEvent e) {

    }
    public void keyPressed(KeyEvent e) {

    }
    public void keyReleased(KeyEvent e) {

    }
}