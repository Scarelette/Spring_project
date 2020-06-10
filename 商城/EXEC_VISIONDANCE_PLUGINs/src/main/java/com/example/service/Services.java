package com.example.service;
import com.example.controller.*;
public abstract class Services//服务的抽象类
{
	/*
	 * 在服务中使用的设计模式有
	 * 策略模式
	 * Bridge模式
	 * Visitor模式
	 */
	abstract public int add(GetDataLogin data);//当用户登录后并查看积分时使用
	abstract public int sub(GetDataOrder data);//当用户购买商品时使用
	abstract public ReturnData[] mes(GetDataOrders data);//当客户需要查看积分明细时使用
}
