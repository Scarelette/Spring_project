package test;

public class Demo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		GetDataLogin gdl=new GetDataLogin(3018216303L);
//		GetDataOrder gdo=new GetDataOrder(3018216303L,20001021L);
//		GetDataOrders gdos=new GetDataOrders(3018216303L);
		long userid=3018216303L;
		long goodid=20001021L;
		CheckController chc=new CheckController();
		AbstractOrderController orc=new OrderController();
		ClickController clc=new ClickController();
		ReturnData ans=new ReturnData();
		ReturnData anses[];
		anses=chc.records(userid);
		for(int i=0;i<anses.length;i++)
		{
			System.out.println(anses[i].getUserid()+" "+anses[i].getCrenum()+" "+anses[i].getTime());
		}
		ans=clc.credict(userid);
		System.out.println(ans.getCrenum());
		ans=orc.order(userid, goodid);
		System.out.println(ans.getNum());
	}

}
