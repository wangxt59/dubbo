package com.wang.pojo;
import java.io.Serializable;
/**
 * admin实体类
 * @author Administrator
 *
 */
public class Admin implements Serializable{

	private String id;//id


	

	private java.util.Date createDate;//create_date

	private String loginname;//loginname

	private String password;//password

	private Integer state;//state

	private java.util.Date updateDate;//update_date

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public java.util.Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}

	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}

	public java.util.Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(java.util.Date updateDate) {
		this.updateDate = updateDate;
	}


	
}
