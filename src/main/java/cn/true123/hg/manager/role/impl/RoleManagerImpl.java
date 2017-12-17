package cn.true123.hg.manager.role.impl;

import cn.true123.hg.manager.role.RoleManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(propagation = Propagation.REQUIRED)
public class RoleManagerImpl implements RoleManager{
}
