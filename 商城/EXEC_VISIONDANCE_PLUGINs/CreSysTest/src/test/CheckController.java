package test;

public class CheckController extends AbstractCheckController//查看积分记录
{
	public ReturnData[] records(long userid)
	{
		Services s=new Service();//里氏替换原则生成服务类
		GetDataOrders data=new GetDataOrders(userid);//一个用于记录在查询积分记录时来自前台的数据的数据结构
		return s.mes(data);//向服务层传入前台的数据，将所有的积分记录返回
	}
}
