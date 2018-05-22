package com.withmes.plan.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * @Description: 菜单角色关联表

 * @author liming
 * @date 2018-05-22
 */
public class SysMeanRoleRelation extends Model<SysMeanRoleRelation> {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单id
     */
	@TableField("meanId")
	private Integer meanId;
	
    /**
     * 角色Id
     */
	@TableField("roleId")
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

	public static final String MEANID = "meanId";

	public static final String ROLEID = "roleId";

	public static final String ID = "id";

	@Override
	protected Serializable pkVal() {
		return this.id;
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
