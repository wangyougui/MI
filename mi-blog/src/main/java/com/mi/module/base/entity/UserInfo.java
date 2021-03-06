package com.mi.module.base.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 *
 * 用户详细; InnoDB free: 3072 kB 实体
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-04.
 */
@TableName("blog_user_info")
public class UserInfo extends Model<UserInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("info_id")
	private String infoId;
    /**
     * 用户ID
     */
	@TableField("user_id")
	private String userId;
    /**
     * 头像地址
     */
	@TableField("avatar_url")
	private String avatarUrl;
    /**
     * 昵称
     */
	@TableField("nick_name")
	private String nickName;
    /**
     * 电话
     */
	private String phone;
    /**
     * 邮箱
     */
	private String email;
    /**
     * 地址
     */
	private String address;
    /**
     * 微信帐号
     */
	private String wechart;
    /**
     * 微信二维码地址
     */
	@TableField("wechart_img")
	private String wechartImg;


	public String getInfoId() {
		return infoId;
	}

	public void setInfoId(String infoId) {
		this.infoId = infoId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWechart() {
		return wechart;
	}

	public void setWechart(String wechart) {
		this.wechart = wechart;
	}

	public String getWechartImg() {
		return wechartImg;
	}

	public void setWechartImg(String wechartImg) {
		this.wechartImg = wechartImg;
	}

	@Override
	protected Serializable pkVal() {
		return this.infoId;
	}

}
