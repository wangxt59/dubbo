package com.wang.pojo;
import java.io.Serializable;
/**
 * article实体类
 * @author Administrator
 *
 */
public class Article implements Serializable{

	private String id;//id


	

	private String columnid;//专栏ID

	private String userid;//用户ID

	private String title;//文章标题

	private String content;//文章内容

	private String image;//文章封面

	private java.util.Date createtime;//createtime

	private java.util.Date updatetime;//修改

	private String ispublic;//是否公开0：不公开 1：公开

	private String istop;//是否置顶0：不置顶 1：置顶

	private Integer visits;//浏览量

	private Integer thumbup;//点赞数

	private Integer comment;//评论数

	private String state;//审核状态0：未审核 1：已审核

	private Integer channelid;//所属频道关联频道表ID

	private String url;//URL地址

	private String type;//文章类型

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getColumnid() {
		return columnid;
	}
	public void setColumnid(String columnid) {
		this.columnid = columnid;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public java.util.Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(java.util.Date createtime) {
		this.createtime = createtime;
	}

	public java.util.Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(java.util.Date updatetime) {
		this.updatetime = updatetime;
	}

	public String getIspublic() {
		return ispublic;
	}
	public void setIspublic(String ispublic) {
		this.ispublic = ispublic;
	}

	public String getIstop() {
		return istop;
	}
	public void setIstop(String istop) {
		this.istop = istop;
	}

	public Integer getVisits() {
		return visits;
	}
	public void setVisits(Integer visits) {
		this.visits = visits;
	}

	public Integer getThumbup() {
		return thumbup;
	}
	public void setThumbup(Integer thumbup) {
		this.thumbup = thumbup;
	}

	public Integer getComment() {
		return comment;
	}
	public void setComment(Integer comment) {
		this.comment = comment;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public Integer getChannelid() {
		return channelid;
	}
	public void setChannelid(Integer channelid) {
		this.channelid = channelid;
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


	
}
