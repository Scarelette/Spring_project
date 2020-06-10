package test;


public abstract class Datas //存储服务所需数据的抽象类
{
	abstract public void getAll();//获取Datas所需的全部数据
	abstract public void updateAll();//向数据库更新所有的数据
	/*
	 * 以下只是一些get,set方法
	 */
	abstract public ReturnData[] getRdata();
	abstract public void setRdata(ReturnData[] rdata);
	abstract public int getCrenum();
	abstract public void setCrenum(int crenum);
	abstract public int getTolcre();
	abstract public void setTolcre(int tolcre);
	abstract public void setUserid(long userid);
	abstract public long getGoodid();
	abstract public void setGoodid(long goodid);
	abstract public int getPrice();
	abstract public void setPrice(int price);
	abstract public CreRecordRop getRecrop();
	abstract public void setRecrop(CreRecordRop recrop);
}
