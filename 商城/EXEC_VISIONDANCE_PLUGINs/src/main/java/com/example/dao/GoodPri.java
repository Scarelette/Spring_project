package com.example.dao;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class GoodPri //这个实体中存的是商品对应的价格
{
	@Id
	@Column(name = "goodid", nullable = true, length = 64)
	private long goodid;
	@Column(name = "crenum", nullable = true, length = 32)
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
