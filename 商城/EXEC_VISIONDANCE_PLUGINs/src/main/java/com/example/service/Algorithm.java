package com.example.service;

import java.util.Date;
import com.example.dao.*;


public class Algorithm extends Algorithms//一个具体的积分增减计算算法类
{
	private int crenum;//某一商品对应的积分
	private Date lst;//上次时间更新的时间
	private CreRecordRop recrop;//数据库积分记录查询/插入/更新接口
	private Datas data;
	Algorithm(Datas data)//这里更新了
	{
		lst=new Date();
		this.data=data;
	}
	public int loginadd(Date now,long userid)//计算登录增加积分函数
	{
		long nowl=now.getTime();//获得当前时间
		long lstl=lst.getTime();//转化为毫秒数
		if(nowl-lstl>=86400000)//如果当前时间和上次更新时间的差值大于等于一天
		{
			insertmes(100,userid);//记录增加积分的记录
			return 100;//返回增肌的积分
		}
		else
		{
			return 0;//不然返回0
		}
	}
	public int ordersub(int tolcre,int crenum,int price,long userid)//计算订单积分对价格增减的函数
	{
		price*=100;//价格转化为对应的积分
		if(tolcre<price)//如果这个用户的积分不够全部抵消
		{
			insertmes(-tolcre,userid);//记录使用全部积分
			tolcre=0;//积分清零
			price-=tolcre;//价格减去积分
			tolcre+=crenum;//获得购买商品的积分
			insertmes(tolcre,userid);//记录获得积分
		}
		else
		{
			tolcre+=crenum;//直接获得购买商品的积分
			tolcre-=price;//减去需要的积分
			insertmes(-price,userid);//记录积分支出
			price=0;//需要的价格为0
		}
		return price/100;//返回使用积分后还要多少钱
	}
	
	/*
	 *以下为一些get,set函数
	 */
	public int getCrenum() 
	{
		return crenum;
	}
	public void setCrenum(int crenum) 
	{
		this.crenum = crenum;
	}
	public Date getLst() 
	{
		return lst;
	}
	public void setLst(Date lst)
	{
		this.lst = lst;
	}
	public void insertmes(int num,long userid)//插入时间，积分数值，用户id
	{
		Date tmpdate=new Date();
		CreRecord tmprec=new CreRecord(userid,num,tmpdate);
		recrop.save(tmprec);
	}
}
