package swing;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class TableScrollbarCustom extends JScrollBar
{

    public TableScrollbarCustom()
    {
        setUI(new TableScrollBarUI());
        setPreferredSize(new Dimension(8, 8));
        setForeground(new Color(253, 230, 153));
        setBackground(new Color(255, 255, 255));
    }
}
