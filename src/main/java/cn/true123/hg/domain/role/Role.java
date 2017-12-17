package cn.true123.hg.domain.role;


import cn.true123.hg.domain.BaseEntity;

import java.io.Serializable;

public class Role extends BaseEntity implements Serializable {


    private static final long serialVersionUID = 3403670484114887153L;
    /**
     * role_name
     */
    private String roleName;

    /**
     * getrole_name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * setrole_name
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}