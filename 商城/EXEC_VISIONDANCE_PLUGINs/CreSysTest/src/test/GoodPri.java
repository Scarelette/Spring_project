package test;
public class GoodPri //这个实体中存的是商品对应的价格
{
	private long goodid;
	private int price;
	GoodPri()
	{
		
	}
	GoodPri(long goodid,int price)
	{
		this.goodid=goodid;
		this.price=price;
	}
	public long getGoodid() 
	{
		return goodid;
	}
	public void setGoodid(long goodid) 
	{
		this.goodid = goodid;
	}
	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
}
