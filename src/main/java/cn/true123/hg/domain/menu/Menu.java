package cn.true123.hg.domain.menu;

import cn.true123.hg.domain.BaseEntity;

import java.io.Serializable;


public class Menu extends BaseEntity implements Serializable {


    private static final long serialVersionUID = 3716665053990242653L;

    /**
     * menu_name
     */
    private String menuName;



    /**
     * getmenu_name
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * setmenu_name
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}