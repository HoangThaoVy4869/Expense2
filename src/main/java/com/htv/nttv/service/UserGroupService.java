/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.htv.nttv.service;

import com.htv.nttv.pojo.Members;
import com.htv.nttv.pojo.Team;
import com.htv.nttv.pojo.User;
import com.htv.nttv.pojo.UserTeam;
import java.util.List;
import java.util.Map;

/**
 *
 * @author USER
 */
public interface UserGroupService {
    List<Object[]> getUser(Map<String, String> params, int page);
    boolean addUserTeam(Map<Integer, Members> members);
//    boolean addUserToGroup(User u, Team t);
}
