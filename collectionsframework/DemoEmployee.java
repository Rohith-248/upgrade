package collectionsframework;

class DemoEmployee implements Comparable<DemoEmployee>
{
	private String ename;
	private int eid;
	private String location;
	
	public DemoEmployee(String ename,int eid,String location)
	{
		this.ename=ename;
		this.eid=eid;
		this.location=location;
		
	}
	
	@Override
	public String toString()
	{
		return ename+"\t"+eid+"\t"+location;
	}
	
	public String getEname()
	{
		return ename;
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public int getEid()
	{
		return eid;
	}
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}

	@Override
	public int compareTo(DemoEmployee o) 
	{
		int compareid=((DemoEmployee)o).getEid();
		return this.eid-compareid;
	}
	


}
