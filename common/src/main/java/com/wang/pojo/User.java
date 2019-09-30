package com.wang.pojo;
import java.io.Serializable;
/**
 * user实体类
 * @author Administrator
 *
 */
public class User implements Serializable{

	private Long id;//主键


	

	private String openId;//微信openid

	private String name;//用户名

	private String account;//账号

	private String password;//密码

	private String email;//邮箱

	private String phone;//手机

	private Integer sex;//性别: 1:男  2:女  3:不确定

	private String address;//送货住址

	private String province;//省市县

	private String balance;//余额

	private Double point;//当前总积分

	private Integer state;//状态 0: 正常  1:锁定 2:待激活

	private java.util.Date createDate;//创建日期

	private java.util.Date updateDate;//更新日期

	private java.util.Date lastDate;//last_date

	private Integer fanscount;//fanscount

	private Integer followcount;//followcount

	private Integer online;//online

	private String avatar;//avatar

	private String nickname;//nickname

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public Double getPoint() {
		return point;
	}
	public void setPoint(Double point) {
		this.point = point;
	}

	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}

	public java.util.Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}

	public java.util.Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(java.util.Date updateDate) {
		this.updateDate = updateDate;
	}

	public java.util.Date getLastDate() {
		return lastDate;
	}
	public void setLastDate(java.util.Date lastDate) {
		this.lastDate = lastDate;
	}

	public Integer getFanscount() {
		return fanscount;
	}
	public void setFanscount(Integer fanscount) {
		this.fanscount = fanscount;
	}

	public Integer getFollowcount() {
		return followcount;
	}
	public void setFollowcount(Integer followcount) {
		this.followcount = followcount;
	}

	public Integer getOnline() {
		return online;
	}
	public void setOnline(Integer online) {
		this.online = online;
	}

	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	
}
