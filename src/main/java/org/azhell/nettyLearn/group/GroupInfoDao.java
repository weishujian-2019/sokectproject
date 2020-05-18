package org.azhell.nettyLearn.group;


import org.azhell.nettyLearn.model.po.GroupInfo;

public interface GroupInfoDao {

    void loadGroupInfo();
    
    GroupInfo getByGroupId(String groupId);
}
