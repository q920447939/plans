package com.withmes.plan.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * @Description: 用户附加信息表
 * @author liming
 * @date 2018-05-18
 */
@TableName("user_annexation")
public class UserAnnexation implements Serializable {

    private static final long serialVersionUID = 1L;

	private Integer id;
	
    /**
     * 用户id
     */
	private Integer userid;
	
    /**
     * 用户头像存放地址
     */
	@TableField("user_portrait_address")
	private String userPortraitAddress;
	
    /**
     * 头像宽度
     */
	@TableField("portrait_width")
	private Float portraitWidth;
	
    /**
     * 头像高度
     */
	@TableField("prottait_height")
	private Float prottaitHeight;
	
    /**
     * 电子邮箱
     */
	private String email;
	


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUserPortraitAddress() {
		return userPortraitAddress;
	}

	public void setUserPortraitAddress(String userPortraitAddress) {
		this.userPortraitAddress = userPortraitAddress;
	}

	public Float getPortraitWidth() {
		return portraitWidth;
	}

	public void setPortraitWidth(Float portraitWidth) {
		this.portraitWidth = portraitWidth;
	}

	public Float getProttaitHeight() {
		return prottaitHeight;
	}

	public void setProttaitHeight(Float prottaitHeight) {
		this.prottaitHeight = prottaitHeight;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserAnnexation{" +
			", id=" + id +
			", userid=" + userid +
			", userPortraitAddress=" + userPortraitAddress +
			", portraitWidth=" + portraitWidth +
			", prottaitHeight=" + prottaitHeight +
			", email=" + email +
			"}";
	}
}
