
package UIModel;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ModelMenu
{
    public String getIcon()
    {
        return icon;
    }

    public void setIcon(String icon)
    {
        this.icon = icon;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public MenuType getType()
    {
        return Type;
    }

    public void setType(MenuType Type)
    {
        this.Type = Type;
    }
    private String icon;
    private String name;
    private MenuType Type;

    public ModelMenu(String icon, String name, MenuType Type)
    {
        this.icon = icon;
        this.name = name;
        this.Type = Type;
    }
    
    public Icon toIcon()
    {
        return new ImageIcon(getClass().getResource("/Icon/"+icon+".png"));
    }
    public static enum MenuType
    {
        TITLE,MENU,EMPTY
    }
}
