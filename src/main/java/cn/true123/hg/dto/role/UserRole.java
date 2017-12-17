package cn.true123.hg.dto.role;


import cn.true123.hg.dto.EntityDto;

import java.io.Serializable;

public class UserRole extends EntityDto implements Serializable {


    private static final long serialVersionUID = 4338056622172636936L;
    /**
     * user_id
     */
    private long userId;

    /**
     * role_id
     */
    private long roleId;

    /**
     * getuser_id
     */
    public long getUserId() {
        return userId;
    }

    /**
     * setuser_id
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }
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
}