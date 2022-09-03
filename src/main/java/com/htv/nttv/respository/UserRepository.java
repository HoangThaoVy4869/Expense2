/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.htv.nttv.respository;

import com.htv.nttv.pojo.User;
import java.util.List;

/**
 *
 * @author USER
 */
public interface UserRepository {
    boolean addUser(User user);
    List<User> getUsers(String username);
    public User getUserById(int id);
}
