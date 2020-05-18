package org.azhell.nettyLearn.group.impl;

import org.azhell.nettyLearn.group.GroupInfoDao;
import org.azhell.nettyLearn.mapper.UserInfoMapper;
import org.azhell.nettyLearn.model.po.GroupInfo;
import org.azhell.nettyLearn.model.po.UserInfo;
import org.azhell.nettyLearn.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GroupInfoDaoImpl implements GroupInfoDao{

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public void loadGroupInfo() {

        List<UserInfo> members = userInfoMapper.selectUserInfoAll();

        GroupInfo groupInfo = new GroupInfo("01", "Group01", "/img/avatar/Group01.jpg", members);
        Constant.groupInfoMap.put(groupInfo.getGroupId(), groupInfo);
    }

    @Override
    public GroupInfo getByGroupId(String groupId) {
        return Constant.groupInfoMap.get(groupId);
    }

}
