package test;

import java.util.List;
import java.util.ArrayList;
public class GoodCreRop 
{
	List<GoodCre> list;
	GoodCreRop()
	{
		list=new ArrayList<GoodCre>();
	}
	public GoodCre findByGoodId(long goodid) 
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
	public void save(GoodCre tmputc) 
	{
		// TODO Auto-generated method stub
		list.add(tmputc);
	}
}
