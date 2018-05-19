package com.withmes.plan.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * @Description: 菜单角色关联表

 * @author liming
 * @date 2018-05-19
 */
@TableName("sys_mean_role_relation")
public class SysMeanRoleRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单id
     */
	private Integer meanId;
	
    /**
     * 角色Id
     */
	private Integer roleId;
	
    /**
     * 主键
     */
	private Integer id;
	


	public Integer getMeanId() {
		return meanId;
	}

	public void setMeanId(Integer meanId) {
		this.meanId = meanId;
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
		return "SysMeanRoleRelation{" +
			", meanId=" + meanId +
			", roleId=" + roleId +
			", id=" + id +
			"}";
	}
}
