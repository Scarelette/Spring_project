package test;


public class GetDataOrders//当客户需要查看积分明细的时候后台收到来自前台的数据
{
	long userid;//客户的id
	int type=3;//数据类型
	GetDataOrders(long userid)
	{
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

	public long getUserid() 
	{
		return userid;
	}

	public void setUserid(long userid) 
	{
		this.userid = userid;
	}
	
}
