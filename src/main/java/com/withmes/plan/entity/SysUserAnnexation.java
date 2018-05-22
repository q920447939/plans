package com.withmes.plan.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * @Description: 用户附加信息表
 * @author liming
 * @date 2018-05-22
 */
public class SysUserAnnexation extends Model<SysUserAnnexation> {

    private static final long serialVersionUID = 1L;

	private Integer id;
	
    /**
     * 用户id
     */
	private Integer userid;
	
    /**
     * 用户头像存放地址
     */
	private String userPortraitAddress;
	
    /**
     * 头像宽度
     */
	private Float portraitWidth;
	
    /**
     * 头像高度
     */
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

	public static final String ID = "id";

	public static final String USERID = "userid";

	public static final String USER_PORTRAIT_ADDRESS = "user_portrait_address";

	public static final String PORTRAIT_WIDTH = "portrait_width";

	public static final String PROTTAIT_HEIGHT = "prottait_height";

	public static final String EMAIL = "email";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "SysUserAnnexation{" +
			", id=" + id +
			", userid=" + userid +
			", userPortraitAddress=" + userPortraitAddress +
			", portraitWidth=" + portraitWidth +
			", prottaitHeight=" + prottaitHeight +
			", email=" + email +
			"}";
	}
}
