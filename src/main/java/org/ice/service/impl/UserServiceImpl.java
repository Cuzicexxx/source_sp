package org.ice.service.impl;

import org.ice.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserInfo(String id) {
        return "get by id :" + id;
    }

}
