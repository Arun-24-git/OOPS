import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class house extends JPanel implements MouseListener {
int x, y;
public house() {
addMouseListener(this);
}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.drawRect(150, 150, 150, 200); // House's outer walls
        g.drawArc(150, 100, 150, 100, 0, 180); // Roof (Arc)


        g.setColor(Color.BLUE);
        g.fillRect(200, 200, 50, 150); // Door filled with blue
        g.setColor(Color.BLACK);
        g.drawRect(200, 200, 50, 150); // Door border

        // Change the door color to red when mouse is clicked on it
        if (x >= 200 && x <= 250 && y >= 200 && y <= 350) {
            g.setColor(Color.RED);
            g.fillRect(200, 200, 50, 150); // Red door
        }
    }
@Override
public void mousePressed(MouseEvent e) {
x = e.getX(); 
y = e.getY(); 
repaint(); 
}


public void mouseClicked(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}
public void mouseEntered(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}
public static void main(String[] args) {

JFrame frame = new JFrame("House App");
house housePanel = new house();
frame.add(housePanel);
frame.setSize(400, 500); // size of the window
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true); // to window visible
}
}

