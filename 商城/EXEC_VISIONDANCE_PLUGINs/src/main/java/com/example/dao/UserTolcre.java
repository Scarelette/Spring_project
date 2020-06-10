package com.example.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserTolcre //这个类中存的元组为{userid,tolcre}，也就是用户id和总积分
{
	/*
	 * 这个类中存的元组为{userid,tolcre}，也就是用户id和总积分
	 */
	@Id
	@Column(name = "userid", nullable = true, length = 64)
	private long userid;
	@Column(name = "tolcre", nullable = true, length = 32)
	private int tolcre;
	public UserTolcre()
	{
		
	}
	public UserTolcre(long userid,int tolcre)
	{
		this.userid=userid;
		this.tolcre=tolcre;
	}
	public long getUserid() 
	{
		return userid;
	}
	public void setUserid(long userid) 
	{
		this.userid = userid;
	}
	public int getTolcre() 
	{
		return tolcre;
	}
	public void setTolcre(int tolcre) 
	{
		this.tolcre = tolcre;
	}
}
