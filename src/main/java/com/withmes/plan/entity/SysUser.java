package com.withmes.plan.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * @Description: 用户表
 * @author liming
 * @date 2018-05-19
 */
@TableName("sys_user")
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
	private String name;
	
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
	@TableField("create_time")
	private Date createTime;
	
    /**
     * 更新时间
     */
	@TableField("update_time")
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
	@TableField("register_type")
	private String registerType;
	


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "SysUser{" +
			", id=" + id +
			", name=" + name +
			", status=" + status +
			", sex=" + sex +
			", createTime=" + createTime +
			", updateTime=" + updateTime +
			", account=" + account +
			", password=" + password +
			", mobile=" + mobile +
			", registerType=" + registerType +
			"}";
	}
}
