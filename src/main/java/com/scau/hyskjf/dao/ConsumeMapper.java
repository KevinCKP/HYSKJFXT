package com.scau.hyskjf.dao;

import com.scau.hyskjf.pojo.Consume;

public interface ConsumeMapper {
    int deleteByPrimaryKey(Integer cumid);

    int insert(Consume record);

    int insertSelective(Consume record);

    Consume selectByPrimaryKey(Integer cumid);

    int updateByPrimaryKeySelective(Consume record);

    int updateByPrimaryKey(Consume record);
}