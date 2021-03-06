package com.abc12366.cms.mapper.db1;

import com.abc12366.cms.model.ChannelUser;
import org.apache.ibatis.annotations.Param;

/**
 * ChannelUserMapper数据库操作接口类
 **/

public interface ChannelUserMapper {


    /**
     * 删除（根据主键ID删除）
     **/
    int deleteByPrimaryKey(@Param("id") Long id);

    /**
     * 添加
     **/
    int insert(ChannelUser record);

    /**
     * 添加 （匹配有值的字段）
     **/
    int insertSelective(ChannelUser record);

    /**
     * 修改 （匹配有值的字段）
     **/
    int updateByPrimaryKeySelective(ChannelUser record);

    /**
     * 修改（根据主键ID修改）
     **/
    int updateByPrimaryKey(ChannelUser record);

}