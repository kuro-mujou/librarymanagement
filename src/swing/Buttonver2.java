package swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.border.AbstractBorder;

public class Buttonver2 extends JButton
{
    public Buttonver2()
    {
        //  Init Color
        setColor(new Color(252, 210, 79));
        shadow = new Color(234, 132, 57);
        colorOver = new Color(255, 220, 119);
        colorClick = new Color(228, 194, 89);
        setContentAreaFilled(false);
        setBorder(new RoundedCornerBorder(getForeground()));
        setFocusable(false);
        //  Add event mouse
        addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent me)
            {
                setBackground(colorOver);
                shadow = new Color(240, 147, 79);
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent me)
            {
                setBackground(color);
                shadow = new Color(234, 132, 57);
                over = false;
            }

            @Override
            public void mousePressed(MouseEvent me)
            {
                setBackground(colorClick);
                shadow = new Color(246, 138, 59);
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

    private Color shadow;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private boolean isBackButton;

    public boolean isIsBackButton()
    {
        return isBackButton;
    }

    public void setIsBackButton(boolean isBackButton)
    {
        this.isBackButton = isBackButton;
    }
    private int radius = 50;

    public Color getShadow()
    {
        return shadow;
    }

    public void setShadow(Color shadow)
    {
        this.shadow = shadow;
    }

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
        int w = getWidth();
        int h = getHeight();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, w, h, radius, radius);
        Area Baseround = new Area(new RoundRectangle2D.Float(0, 0, w, h, radius, radius));
        Area Subround = new Area(new RoundRectangle2D.Float(0, -10, w, h, radius, radius));
        Baseround.subtract(Subround);
        g2.setPaint(shadow);
        g2.fill(Baseround);
        if (isBackButton == true)
        {
            int width = getWidth();
            int height = getHeight();
            int sizeX = 50;
            int sizeY = 30;
            int x = width - sizeX;
            int y = height - sizeY;
            int px[] =
            {
                x, x - sizeX + 40, x
            };
            int py[] =
            {
                y, height / 2, sizeY
            };
            g2.setColor(new Color(0, 0, 0));
            g2.fillPolygon(px, py, px.length);
        }
        super.paintComponent(grphcs);
    }

    class RoundedCornerBorder extends AbstractBorder
    {
        private final Color color;

        public RoundedCornerBorder(Color color)
        {
            this.color = color;
        }

        @Override
        public void paintBorder(
                Component c, Graphics g, int x, int y, int width, int height)
        {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            float w = width - 0.5f;
            float h = height - 0.5f;
            Area round = new Area(new RoundRectangle2D.Float(x + 0.5f, y + 0.5f, w - 0.5f, h - 0.5f, radius, radius));
            g2.setPaint(color);
            g2.draw(round);
            g2.dispose();
        }

        @Override
        public Insets getBorderInsets(Component c)
        {
            return new Insets(8, 8, 8, 8);
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets)
        {
            insets.set(8, 8, 8, 8);
            return insets;
        }
    }
}
