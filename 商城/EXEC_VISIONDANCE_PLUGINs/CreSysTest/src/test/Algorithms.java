package test;


import java.util.Date;

public abstract class Algorithms //提供计算积分增加和减少的算法，可以进行各种扩展，比如活动积分使用
{
	//这个函数是在用户登录后进入积分系统时使用的，可以完成增加登录积分以及返回用户积分总额度
	//参数分别为当前的时间和用户id
	abstract public int loginadd(Date now,long userid);
	//这个函数是在用户有订单的时候使用的
	//参数分别为，用户总积分，购买此商品增加的积分，商品的价格，用户id
	abstract public int ordersub(int tolcre,int crenum,int price,long userid);
	/*
	 * 以下只是一些get,set方法
	 */
	abstract public Date getLst();
	abstract public void setCrenum(int crenum);
	abstract public int getCrenum();
	abstract public void setLst(Date lst);
}
