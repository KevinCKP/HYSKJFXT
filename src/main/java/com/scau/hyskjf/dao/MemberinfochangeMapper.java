package com.scau.hyskjf.dao;

import com.scau.hyskjf.pojo.Memberinfochange;

public interface MemberinfochangeMapper {
    int deleteByPrimaryKey(Integer micid);

    int insert(Memberinfochange record);

    int insertSelective(Memberinfochange record);

    Memberinfochange selectByPrimaryKey(Integer micid);

    int updateByPrimaryKeySelective(Memberinfochange record);

    int updateByPrimaryKey(Memberinfochange record);
}