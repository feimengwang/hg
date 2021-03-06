package cn.true123.hg.dto.role;



import cn.true123.hg.dto.EntityDto;

import java.io.Serializable;

public class RoleMenuDto extends EntityDto implements Serializable {

    private static final long serialVersionUID = 3069674242685019224L;
    /**
     * role_id
     */
    private long roleId;

    /**
     * menu_id
     */
    private long menuId;


    /**
     * getrole_id
     */
    public long getRoleId() {
        return roleId;
    }

    /**
     * setrole_id
     */
    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }
    /**
     * getmenu_id
     */
    public long getMenuId() {
        return menuId;
    }

    /**
     * setmenu_id
     */
    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }
}