package test;

abstract public class AbstractCheckController//用用响应前台查看积分记录的抽象控制器
{
	abstract public ReturnData[] records(long userid);//返回对应用户id积分记录的函数
}
