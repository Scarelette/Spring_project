package com.example.controller;

import java.util.Date;

public class GetDataLogin//用于存储用户登入并查看积分时前台传来的数据
{
	long userid;//客户id
	Date time;//当前时间（目前没有什么用）
	int type=1;//数据结构类型（目前没有什么用）
	/*
	 * 以下只是一些简单的构造函数和get,set方法
	 */
	GetDataLogin(long userid)
	{
		this.userid=userid;
	}
	GetDataLogin()
	{
		
	}
	public int getType() 
	{
		return type;
	}
	public void setType(int type) 
	{
		this.type = type;
	}
	public long getUserid() 
	{
		return userid;
	}
	public void setUserid(long userid) 
	{
		this.userid = userid;
	}
	public Date getTime() 
	{
		return time;
	}
	public void setTime(Date time) 
	{
		this.time = time;
	}
	
}
