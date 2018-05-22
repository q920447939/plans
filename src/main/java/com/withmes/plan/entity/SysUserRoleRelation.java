package com.withmes.plan.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * @Description: 用户角色关联表
 * @author liming
 * @date 2018-05-22
 */
public class SysUserRoleRelation extends Model<SysUserRoleRelation> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
	@TableField("userId")
	private Integer userId;
	
    /**
     * 角色Id
     */
	@TableField("roleId")
	private Integer roleId;
	
    /**
     * 主键
     */
	private Integer id;
	


	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public static final String USERID = "userId";

	public static final String ROLEID = "roleId";

	public static final String ID = "id";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "SysUserRoleRelation{" +
			", userId=" + userId +
			", roleId=" + roleId +
			", id=" + id +
			"}";
	}
}
