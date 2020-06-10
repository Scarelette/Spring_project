package test;

import java.util.Date;


public class Service extends Services//一个实际的服务类
{
	Algorithms al;//积分增删算法，这个是抽象类，使用里氏替换用子类Algorithm类替换，主要负责积分的增减
	Datas datas;//服务所需要的数据结构，这部分根据前台发到后台的数据来从数据库中进行初始化
	public int add(GetDataLogin data)//登录加积分，也用于显示积分
	{
		datas=new Data(data.getUserid());//初始化服务类中的这个函数所需的数据
		al=new Algorithm(datas);//实例化算法
		int tmpcre=datas.getTolcre();//获取当前用户的总积分
		Date tmpd=new Date();//获取当前的时间
		tmpcre+=al.loginadd(tmpd,data.getUserid());//使用积分算法算出是否可以增加登录积分
		datas.setTolcre(tmpcre);//更新客户积分
		datas.updateAll();//回写数据库的函数
		return tmpcre;//当前客户所持有的积分
	}
	public int sub(GetDataOrder data)//购买减少/增加积分
	{
		datas=new Data(data.getUserid(),data.getGoodid());//初始化所需的数据
		al=new Algorithm(datas);//初始化算法
		int disprice=0;//初始化用积分后需要的钱数，汇率为1:100
		//使用算法计算得到的钱数目
		disprice=al.ordersub(datas.getTolcre(),datas.getCrenum(),datas.getPrice(),data.getUserid());
		//以下为更新用户持有的积分数目，不允许购买商品得到的积分马上用于获得积分的商品
		if(datas.getTolcre()>=datas.getPrice()*100)//当前积分可以完全抵消商品价格时
		{
			datas.setTolcre(datas.getTolcre()-datas.getPrice()*100);
		}
		else
		{
			datas.setTolcre(datas.getCrenum());//不能完全抵消商品价格时，先变为0，之后加上此商品得到的积分
		}
		datas.updateAll();//将当前积分写回数据库
		return disprice;//最后商品需要的价格
	}
	public ReturnData[] mes(GetDataOrders data)//返回积分记录
	{
		datas=new Data(data.getUserid());//初始化数据结构
		return datas.getRdata();//直接返回积分记录
	}
}
