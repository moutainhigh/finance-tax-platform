package com.abc12366.bangbang.model.curriculum.bo;
import com.abc12366.bangbang.model.curriculum.CurriculumClassifyTag;

import java.io.Serializable;
import java.util.List;


/**
 * 
 * 课程分类表
 * 
 **/
@SuppressWarnings("serial")
public class CurriculumClassifyBo implements Serializable {

	/**分类ID**varchar(64)**/
	private String classifyId;

	/**父分类ID**varchar(64)**/
	private String parentId;

    /**分类名称**varchar(100)**/
    private String classifyName;

    /*分类父名称*/
    private String parentName;

	/**排列顺序**int**/
	private Integer priority;

    /**是否显示**int**/
    private Integer isDisplay;

    private List<CurriculumClassifyTag> tagList;

    public String getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(String classifyId) {
        this.classifyId = classifyId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Integer isDisplay) {
        this.isDisplay = isDisplay;
    }

    public String getParentName() {
        return parentName;
    }

    public CurriculumClassifyBo setParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }

    public List<CurriculumClassifyTag> getTagList() {
        return tagList;
    }

    public void setTagList(List<CurriculumClassifyTag> tagList) {
        this.tagList = tagList;
    }
}
