package test;

import java.util.ArrayList;
import java.util.List;

public class CreRecordRop 
{
	List<CreRecord> list;
	CreRecordRop()
	{
		list=new ArrayList<CreRecord>();
	}
	public List<CreRecord> findByUserId(long userid) 
	{
		// TODO Auto-generated method stub
		List<CreRecord> ans=new ArrayList<CreRecord>();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getUserid()==userid)
			{
				ans.add(list.get(i));
			}
		}
		return ans;
	}

	public void save(CreRecord tmprec) 
	{
		// TODO Auto-generated method stub
		list.add(tmprec);
	}

}
