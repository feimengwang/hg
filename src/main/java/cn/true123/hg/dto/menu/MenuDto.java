package cn.true123.hg.dto.menu;


import cn.true123.hg.dto.EntityDto;

import java.io.Serializable;


public class MenuDto extends EntityDto implements Serializable {


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