package com.example.controller;
import java.util.Date;
import com.example.service.*;
public class ReturnData//统一的返回数据
{
	private long userid;//用户id
	private int crenum;//用户当前积分或者是积分明细中的记录，数据范围为min_integer~max_integer
	private int num;//因为积分减少的钱数目
	private Date time;//记录的时间
	public ReturnData()
	{
		
	}
	public int getNum() 
	{
		return num;
	}
	public void setNum(int num) 
	{
		this.num = num;
	}
	public Date getTime() 
	{
		return time;
	}
	public void setTime(Date time) 
	{
		this.time = time;
	}
	ReturnData(long userid,int crenum)
	{
		this.userid=userid;
		this.crenum=crenum;
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
}
