package com.withmes.plan.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * @Description: 角色表
 * @author liming
 * @date 2018-05-19
 */
@TableName("sys_role")
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	
    /**
     * 父级角色ID
     */
	@TableField("parent_id")
	private Integer parentId;
	
    /**
     * 角色名称
     */
	@TableField("role_name")
	private String roleName;
	
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;
	
    /**
     * 更新时间
     */
	@TableField("upate_time")
	private Date upateTime;
	
    /**
     * 描述
     */
	private String description;
	


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpateTime() {
		return upateTime;
	}

	public void setUpateTime(Date upateTime) {
		this.upateTime = upateTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "SysRole{" +
			", id=" + id +
			", parentId=" + parentId +
			", roleName=" + roleName +
			", createTime=" + createTime +
			", upateTime=" + upateTime +
			", description=" + description +
			"}";
	}
}
