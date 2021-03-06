package com.main.tgcareer.modules.user.dao;

import com.main.tgcareer.modules.user.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserDao {
    /**
     * 根据openID返回用户
     * @param id
     * @return User
     */
    public User getUser(String id);

    /**
     * 新增用户
     * @param user
     */
    public void saveUser(User user);

    /**
     * 更新用户信息
     * @param user
     */
    public void updateUser(User user);

    /**
     * 删除用户
     * @param id
     */
    public void deleteUser(String id);

    /*
    * 新增用户时  设置用户id
     */
    public void setId(String id);
}

