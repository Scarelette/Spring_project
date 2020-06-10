package test;
public class GoodCre //这个实体中存的是商品对应增加的积分
{
	private long goodid;
	private int crenum;
	public long getGoodid() 
	{
		return goodid;
	}
	public void setGoodid(long goodid) 
	{
		this.goodid = goodid;
	}
	public int getCrenum() 
	{
		return crenum;
	}
	public void setCrenum(int crenum) 
	{
		this.crenum = crenum;
	}
	GoodCre()
	{
		
	}
	GoodCre(long goodid,int crenum)
	{
		this.goodid=goodid;
		this.crenum=crenum;
	}
}
