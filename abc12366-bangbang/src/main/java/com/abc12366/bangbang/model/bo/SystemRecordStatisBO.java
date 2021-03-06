package com.abc12366.bangbang.model.bo;
import java.io.Serializable;


/**
 * @author lizhongwei
 * @create 2017-12-12 12:21 PM
 * 用户使用系统记录
 * 
 **/
@SuppressWarnings("serial")
public class SystemRecordStatisBO implements Serializable {

	/**PK**/
	private String id;

	/**访问次数**/
	private Integer count;

	/**菜单名称**/
	private String menu;

	/**统计时间**/
	private java.util.Date createTime;



	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return this.id;
	}

	public void setCount(Integer count){
		this.count = count;
	}

	public Integer getCount(){
		return this.count;
	}

	public void setMenu(String menu){
		this.menu = menu;
	}

	public String getMenu(){
		return this.menu;
	}

	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}

	public java.util.Date getCreateTime(){
		return this.createTime;
	}

}
