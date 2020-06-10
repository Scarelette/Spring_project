package test;
import java.util.Date;
import java.util.List;
public class Data extends Datas//存储服务所需数据的具体类
{
	private ReturnData[] rdata;//积分详情
	private int tolcre;//总积分
	private int crenum;//商品对应加积分
	private long userid;//用户id
	private long goodid;//商品id
	private int price;//商品的价格
	private CreRecordRop recrop;//积分记录表的接口
	public CreRecordRop getRecrop() {
		return recrop;
	}
	public void setRecrop(CreRecordRop recrop) {
		this.recrop = recrop;
	}
	private GoodCreRop goodrop;//商品对应积分的表
	private GoodPriRop prirop;//商品价格的表
	private UserTolcreRop tolrop;//用户总积分表
	/*
	 * 三种不同的构造函数用来对应来自于前端不同的数据结构
	 */
	Data()
	{
		init();
		getAll();//新加的
	}
	Data(long userid)
	{
		this.userid=userid;
		goodid=-1;//只是一个标记
		init();
		getAll();//新加的
	}
	Data(long userid,long goodid)
	{
		this.userid=userid;
		this.goodid=goodid;
		init();
		getAll();//新加的
	}
	public void init()//新加的
	{
		recrop=new CreRecordRop();
		goodrop=new GoodCreRop();
		prirop=new GoodPriRop();
		tolrop=new UserTolcreRop();
		UserTolcre utc=new UserTolcre(3018216303L,1000);
		tolrop.save(utc);
		GoodPri gpr=new GoodPri(20001021L,10);
		prirop.save(gpr);
		GoodCre gcr=new GoodCre(20001021L,2000);
		goodrop.save(gcr);
		Date date=new Date();
		CreRecord crc=new CreRecord(3018216303L,-100,date);
		recrop.save(crc);
	}
	public void getAll()//获取所有的数据
	{
		if(goodid==-1)//当是-1时说明不可能为订单请求
		{
			List<CreRecord> rec=recrop.findByUserId(this.userid);//获取全部积分信息
			rdata=new ReturnData[rec.size()];//从数据库中得到的信息格式转化
			for(int i=0;i<rec.size();i++)//从数据库中得到的信息格式转化
			{
				//这里修改了
				ReturnData tmp=new ReturnData();
				tmp.setTime(rec.get(i).getTime());
				tmp.setUserid(userid);
				tmp.setCrenum(rec.get(i).getCrenum());
				rdata[i]=tmp;
//				rdata[i].setTime(rec.get(i).getTime());//从数据库中得到的信息格式转化
//				rdata[i].setUserid(userid);//从数据库中得到的信息格式转化
//				rdata[i].setCrenum(rec.get(i).getCrenum());//从数据库中得到的信息格式转化
			}
			tolcre=tolrop.findByUserId(userid).getTolcre();//得到用户的总积分
		}
		else
		{
			price=prirop.findByGoodId(goodid).getPrice();//得到订单中商品的价格
			crenum=goodrop.findByGoodId(goodid).getCrenum();//得到购买此商品能得到的积分个数
		}
	}
	public void updateAll()//更新所有的数据（目前只需要更新用户的总积分）
	{
		UserTolcre tmputc=new UserTolcre(userid,tolcre);//要更新的新数据
		tolrop.deleteById(userid);//删去原先的记录，因为userid为主键，所以这个可以完成
		tolrop.save(tmputc);//写入新的数据
	}
	/*
	 * 以下为一些get,set方法
	 */
	public int getTolcre() 
	{
		return tolcre;
	}
	public void setTolcre(int tolcre) 
	{
		this.tolcre = tolcre;
	}
	public ReturnData[] getRdata() 
	{
		return rdata;
	}
	public void setRdata(ReturnData[] rdata) 
	{
		this.rdata = rdata;
	}
	public int getCrenum() 
	{
		return crenum;
	}
	public long getUserid() 
	{
		return userid;
	}
	public void setUserid(long userid) 
	{
		this.userid = userid;
	}
	public long getGoodid() 
	{
		return goodid;
	}
	public void setGoodid(long goodid) 
	{
		this.goodid = goodid;
	}
	public void setCrenum(int crenum) 
	{
		this.crenum = crenum;
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
