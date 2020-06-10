package test;


public class GetDataOrder//用于当用户产生订单时需要使用/增加积分时前台向后台传输的数据
{
	long goodid;//商品id
	long userid;//用户id
	int type=2;//数据类型
	/*
	 * 接下来只是一些构造函数和get,set方法
	 */
	GetDataOrder()
	{
		
	}
	GetDataOrder(long userid,long goodid)
	{
		this.goodid=goodid;
		this.userid=userid;
	}
	public int getType() 
	{
		return type;
	}
	public void setType(int type) 
	{
		this.type = type;
	}
	public long getGoodid() 
	{
		return goodid;
	}
	public void setGoodid(long goodid) 
	{
		this.goodid = goodid;
	}
	public long getUserid() 
	{
		return userid;
	}
	public void setUserid(long userid) 
	{
		this.userid = userid;
	}
}
