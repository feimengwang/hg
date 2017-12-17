package cn.true123.hg.manager.user.impl;

import cn.true123.hg.manager.user.UserManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(propagation = Propagation.REQUIRED)
public class UserManagerImpl implements UserManager {
}
