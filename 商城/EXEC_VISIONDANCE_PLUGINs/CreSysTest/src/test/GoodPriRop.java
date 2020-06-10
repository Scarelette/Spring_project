package test;
import java.util.*;
public class GoodPriRop 
{
	List<GoodPri> list;
	GoodPriRop()
	{
		list=new ArrayList<GoodPri>();
	}
	public GoodPri findByGoodId(long goodid) 
	{
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getGoodid()==goodid)
			{
				return list.get(i);
			}
		}
		return null;
	}
	public void save(GoodPri tmputc) 
	{
		// TODO Auto-generated method stub
		list.add(tmputc);
	}
}
