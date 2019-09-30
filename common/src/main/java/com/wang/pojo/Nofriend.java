package com.wang.pojo;
import java.io.Serializable;
/**
 * nofriend实体类
 * @author Administrator
 *
 */
public class Nofriend implements Serializable{

	private Long id;//id


	

	private String userid;//userid

	private String friendid;//friendid

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getFriendid() {
		return friendid;
	}
	public void setFriendid(String friendid) {
		this.friendid = friendid;
	}


	
}
