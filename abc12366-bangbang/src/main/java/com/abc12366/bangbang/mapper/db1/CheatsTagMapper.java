package com.abc12366.bangbang.mapper.db1;

import com.abc12366.bangbang.model.question.CheatsTag;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * CheatsTagMapper数据库操作接口类
 * 
 **/

public interface CheatsTagMapper{

	/**
	 * 
	 * 删除（根据主键ID删除）
	 * 
	 **/
	int deleteByPrimaryKey(@Param("id") String id);

	/**
	 * 
	 * 添加
	 * 
	 **/
	int insert(CheatsTag record);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int insertSelective(CheatsTag record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(CheatsTag record);

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey(CheatsTag record);

}