package com.ds.reverse.mapper;

import com.ds.reverse.po.CustomerPO;

public interface CustomerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CustomerPO record);

    int insertSelective(CustomerPO record);

    CustomerPO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomerPO record);

    int updateByPrimaryKey(CustomerPO record);
}