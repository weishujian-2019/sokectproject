package org.azhell.nettyLearn.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.azhell.nettyLearn.model.po.UserInfo;

import java.util.List;

public interface UserInfoMapper{

    UserInfo getByUsername(String username);

    UserInfo getByUserId(String userId);

    List<UserInfo> selectUserInfoAll();
}
