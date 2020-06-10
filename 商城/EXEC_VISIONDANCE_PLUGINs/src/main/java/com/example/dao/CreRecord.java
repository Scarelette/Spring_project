package com.example.dao;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class CreRecord//这个实体中存的是记录id，用户id，用户积分增减数值，时间
{
	@Id
	@Column(name = "recid", nullable = true, length = 128)
	private long recid;
	@Column(name = "userid", nullable = true, length = 64)
	private long userid;
	@Column(name = "crenum", nullable = true, length = 32)
	private int crenum;//积分数值
	@Column(name = "time", nullable = true, length = 20)
	private Date time;
	public CreRecord()
	{
		
	}
	public CreRecord(long userid,int crenum,Date time)
	{
		this.userid=userid;
		this.crenum=crenum;
		this.time=time;
	}
	public long getUserid() 
	{
		return userid;
	}
	public void setUserid(long userid) 
	{
		this.userid = userid;
	}
	public int getCrenum() 
	{
		return crenum;
	}
	public void setCrenum(int crenum) 
	{
		this.crenum = crenum;
	}
	public Date getTime() 
	{
		return time;
	}
	public void setTime(Date time) 
	{
		this.time = time;
	}
	public long getRecid() 
	{
		return recid;
	}
	public void setRecid(long recid) 
	{
		this.recid = recid;
	}
}
