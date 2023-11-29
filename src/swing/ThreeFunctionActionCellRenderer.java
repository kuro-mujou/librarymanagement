package swing;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class ThreeFunctionActionCellRenderer extends DefaultTableCellRenderer
{
    Color selectcolor;
    public ThreeFunctionActionCellRenderer(Color selectcolor)
    {
        this.selectcolor = selectcolor;
    }
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        ThreeFunctionButton bookButton = new ThreeFunctionButton();
        
        if (isSelected == true)
        {
            bookButton.setBackground(selectcolor);
        } else
        {
            bookButton.setBackground(new Color(255, 255, 255));
        }
        bookButton.setBorder(new LineBorder(new Color(217, 181, 68, 100), 1));
        return bookButton;
    }

}
