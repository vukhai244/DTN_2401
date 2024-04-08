package com.vti.entity;

import java.util.Date;

public class Group {
    private int groupId;
    private String groupName;
    private Account creator;
    private Date createDate;

    public int getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public Account getCreator() {
        return creator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}