package com.withmes.plan.entity;

import java.io.Serializable;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * @Description: 菜单表
 * @author liming
 * @date 2018-05-22
 */
public class SysMean extends Model<SysMean> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	private Integer id;
	
    /**
     * 菜单名字
     */
	private String name;
	
    /**
     * 菜单地址
     */
	private String address;
	
    /**
     * 地址描述
     */
	private String addressExplain;
	
    /**
     * 父菜单ID
     */
	private Integer parentId;
	
    /**
     * 创建时间
     */
	private Date createTime;
	
    /**
     * 更新时间
     */
	private Date upateTime;
	
    /**
     * 菜单描述
     */
	private String description;
	
    /**
     * 状态(0-隐藏,1-显示)
     */
	private String status;
	


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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressExplain() {
		return addressExplain;
	}

	public void setAddressExplain(String addressExplain) {
		this.addressExplain = addressExplain;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static final String ID = "id";

	public static final String NAME = "name";

	public static final String ADDRESS = "address";

	public static final String ADDRESS_EXPLAIN = "address_explain";

	public static final String PARENT_ID = "parent_id";

	public static final String CREATE_TIME = "create_time";

	public static final String UPATE_TIME = "upate_time";

	public static final String DESCRIPTION = "description";

	public static final String STATUS = "status";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "SysMean{" +
			", id=" + id +
			", name=" + name +
			", address=" + address +
			", addressExplain=" + addressExplain +
			", parentId=" + parentId +
			", createTime=" + createTime +
			", upateTime=" + upateTime +
			", description=" + description +
			", status=" + status +
			"}";
	}
}
