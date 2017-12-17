package cn.true123.hg.dao;

import cn.true123.hg.domain.role.Role;

import java.util.List;

public interface RoleDao {
    /**
     * 可空字段过滤null值
     * @param role
     * @return
     */
    public int insertByRole(Role role);


    /**
     * 可空字段过滤null值
     * @param role
     * @return
     */
    public int updateByRole(Role role);

    /**
     * 获取单个Role
     * @param role
     * @return Role
     */
    public Role querySingleRole(Role role);

    /**
     * 获取
     * @param role
     * @return List<OrgInfoDto>
     */
    public List<Role> queryRole(Role role);

    /**
     * 根据主键ID逻辑删除
     * @param id
     * @return
     */
    public int deleteByPrimaryKey(Long id);

    /**
     * 逻辑删除
     * @param role
     * @return
     */
    public int delete(Role role);

}
