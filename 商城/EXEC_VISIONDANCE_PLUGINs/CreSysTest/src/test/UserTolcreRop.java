package test;
import java.util.*;
public class UserTolcreRop 
{
	List<UserTolcre> list;
	UserTolcreRop()
	{
		list=new ArrayList<UserTolcre>();
	}
	public UserTolcre findByUserId(long userid) 
	{
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getUserid()==userid)
			{
				return list.get(i);
			}
		}
		return null;
	}

	public void deleteById(long userid) 
	{
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getUserid()==userid)
			{
				list.remove(i);
			}
		}
	}

	public void save(UserTolcre tmputc) 
	{
		// TODO Auto-generated method stub
		list.add(tmputc);
	}

}
