package org.azhell.nettyLearn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.azhell.nettyLearn.mapper.UserInfoMapper;
import org.azhell.nettyLearn.model.po.UserInfo;
import org.azhell.nettyLearn.model.vo.ResponseJson;
import org.azhell.nettyLearn.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    
    @Override
    public ResponseJson getByUserId(String userId) {
        UserInfo userInfo = userInfoMapper.getByUserId(userId);
        return new ResponseJson().success()
                .setData("userInfo", userInfo);
    }

}
