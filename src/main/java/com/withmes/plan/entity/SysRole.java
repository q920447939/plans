package com.withmes.plan.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * @Description: 角色表
 * @author liming
 * @date 2018-05-22
 */
public class SysRole extends Model<SysRole> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	
    /**
     * 父级角色ID
     */
	private Integer parentId;
	
    /**
     * 角色名称
     */
	private String roleName;
	
    /**
     * 创建时间
     */
	private Date createTime;
	
    /**
     * 更新时间
     */
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

	public static final String ID = "id";

	public static final String PARENT_ID = "parent_id";

	public static final String ROLE_NAME = "role_name";

	public static final String CREATE_TIME = "create_time";

	public static final String UPATE_TIME = "upate_time";

	public static final String DESCRIPTION = "description";

	@Override
	protected Serializable pkVal() {
		return this.id;
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
