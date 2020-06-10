package com.example.dao;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class GoodCre //这个实体中存的是商品对应增加的积分
{
	@Id
	@Column(name = "goodid", nullable = true, length = 64)
	private long goodid;
	@Column(name = "crenum", nullable = true, length = 32)
	private int crenum;
	public long getGoodid() 
	{
		return goodid;
	}
	public void setGoodid(long goodid) 
	{
		this.goodid = goodid;
	}
	public int getCrenum() 
	{
		return crenum;
	}
	public void setCrenum(int crenum) 
	{
		this.crenum = crenum;
	}
	GoodCre()
	{
		
	}
	GoodCre(long goodid,int crenum)
	{
		this.goodid=goodid;
		this.crenum=crenum;
	}
}
