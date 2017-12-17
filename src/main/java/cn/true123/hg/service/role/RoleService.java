package cn.true123.hg.service.role;

import cn.true123.hg.dto.role.RoleDto;

public interface RoleService {
    public RoleDto findRole(long roleId);

    public boolean addRole(RoleDto roleDto);

    public boolean updateRole(RoleDto roleDto);
}
