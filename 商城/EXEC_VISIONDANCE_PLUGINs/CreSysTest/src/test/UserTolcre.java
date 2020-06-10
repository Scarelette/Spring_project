package test;


public class UserTolcre //这个类中存的元组为{userid,tolcre}，也就是用户id和总积分
{
	/*
	 * 这个类中存的元组为{userid,tolcre}，也就是用户id和总积分
	 */

	private long userid;
	private int tolcre;
	public UserTolcre()
	{
		
	}
	public UserTolcre(long userid,int tolcre)
	{
		this.userid=userid;
		this.tolcre=tolcre;
	}
	public long getUserid() 
	{
		return userid;
	}
	public void setUserid(long userid) 
	{
		this.userid = userid;
	}
	public int getTolcre() 
	{
		return tolcre;
	}
	public void setTolcre(int tolcre) 
	{
		this.tolcre = tolcre;
	}
}
