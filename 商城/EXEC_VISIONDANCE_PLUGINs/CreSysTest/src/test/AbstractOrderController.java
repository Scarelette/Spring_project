package test;

abstract public class AbstractOrderController//响应订单所需积分增减的抽象控制器
{
	abstract public ReturnData order(long userid,long goodid);
	//返回的数据中有效的数据为减少的价格，用户id，也就是num,userid
}
