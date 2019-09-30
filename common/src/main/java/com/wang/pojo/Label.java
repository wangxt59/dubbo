package com.wang.pojo;
import java.io.Serializable;
/**
 * label实体类
 * @author Administrator
 *
 */
public class Label implements Serializable{

	private String id;//id


	

	private Long count;//count

	private Long fans;//fans

	private String labelname;//labelname

	private String recommend;//recommend

	private String state;//state

	private String labelName;//label_name

	private java.util.Date createTime;//create_time

	private java.util.Date updateTime;//update_time

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public Long getFans() {
		return fans;
	}
	public void setFans(Long fans) {
		this.fans = fans;
	}

	public String getLabelname() {
		return labelname;
	}
	public void setLabelname(String labelname) {
		this.labelname = labelname;
	}

	public String getRecommend() {
		return recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getLabelName() {
		return labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	public java.util.Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}


	
}
