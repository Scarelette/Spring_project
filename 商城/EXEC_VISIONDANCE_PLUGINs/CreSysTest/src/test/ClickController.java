package test;

public class ClickController//登录后进行积分计算
{
	public ReturnData credict(long userid)
	{
		Services s=new Service();//获取服务类
		GetDataLogin data=new GetDataLogin(userid);//用数据结构存储前台数据
		ReturnData tmp=new ReturnData();//用于返回的统一数据结构
		tmp.setUserid(userid);//为数据结构设置有效数据
		tmp.setCrenum(s.add(data));//服务判断距离上次登录是否超过一天，如果超过一天则增加积分
		return tmp;//返回统一数据结构
	}
}
