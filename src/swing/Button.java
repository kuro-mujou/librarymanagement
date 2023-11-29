package swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class Button extends JButton
{
    public Button()
    {
        //  Init Color
        setBackground(color);
        colorOver = new Color(230, 230, 230);
        colorClick = new Color(209, 209, 209);
        setContentAreaFilled(false);
        setBorder(null);
        setFocusable(false);
        //  Add event mouse
        addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent me)
            {
                setBackground(colorOver);
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent me)
            {
                setBackground(color);
                over = false;
            }

            @Override
            public void mousePressed(MouseEvent me)
            {

                setBackground(colorClick);
            }

            @Override
            public void mouseReleased(MouseEvent me)
            {
                if (over)
                {
                    setBackground(colorOver);
                } else
                {
                    setBackground(color);
                }
            }
        });
    }

    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private int radius = 50;

    public boolean isOver()
    {
        return over;
    }

    public void setOver(boolean over)
    {
        this.over = over;
    }

    public Color getColor()
    {
        return color;
    }

    public void setColor(Color color)
    {
        this.color = color;
        setBackground(color);
    }

    public Color getColorOver()
    {
        return colorOver;
    }

    public void setColorOver(Color colorOver)
    {
        this.colorOver = colorOver;
    }

    public Color getColorClick()
    {
        return colorClick;
    }

    public void setColorClick(Color colorClick)
    {
        this.colorClick = colorClick;
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    @Override
    protected void paintComponent(Graphics grphcs)
    {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        super.paintComponent(grphcs);
    }
}
