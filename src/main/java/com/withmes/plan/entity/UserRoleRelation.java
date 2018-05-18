package com.withmes.plan.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * @Description: 用户角色关联表
 * @author liming
 * @date 2018-05-18
 */
@TableName("user_role_relation")
public class UserRoleRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
	private Integer userId;
	
    /**
     * 角色Id
     */
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

	@Override
	public String toString() {
		return "UserRoleRelation{" +
			", userId=" + userId +
			", roleId=" + roleId +
			", id=" + id +
			"}";
	}
}