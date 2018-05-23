package com.withmes.plan.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * @Description: 用户表
 * @author liming
 * @date 2018-05-23
 */
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	
    /**
     * 用户姓名
     */
	private String username;
	
    /**
     * 状态(0-锁定,1-正常)
     */
	private String status;
	
    /**
     * 性别(0-女,1-男)
     */
	private String sex;
	
    /**
     * 创建时间
     */
	private Date createTime;
	
    /**
     * 更新时间
     */
	private Date updateTime;
	
    /**
     * 账号
     */
	private String account;
	
    /**
     * 密码
     */
	private String password;
	
    /**
     * 手机
     */
	private String mobile;
	
    /**
     * 注册类型(0-手机注册,1-网页注册,2-后台注册)
     */
	private String registerType;
	
	private String nickname;
	


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRegisterType() {
		return registerType;
	}

	public void setRegisterType(String registerType) {
		this.registerType = registerType;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public static final String ID = "id";

	public static final String USERNAME = "username";

	public static final String STATUS = "status";

	public static final String SEX = "sex";

	public static final String CREATE_TIME = "create_time";

	public static final String UPDATE_TIME = "update_time";

	public static final String ACCOUNT = "account";

	public static final String PASSWORD = "password";

	public static final String MOBILE = "mobile";

	public static final String REGISTER_TYPE = "register_type";

	public static final String NICKNAME = "nickname";

	@Override
	public String toString() {
		return "SysUser{" +
			", id=" + id +
			", username=" + username +
			", status=" + status +
			", sex=" + sex +
			", createTime=" + createTime +
			", updateTime=" + updateTime +
			", account=" + account +
			", password=" + password +
			", mobile=" + mobile +
			", registerType=" + registerType +
			", nickname=" + nickname +
			"}";
	}
}
