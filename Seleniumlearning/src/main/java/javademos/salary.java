package javademos;

public class salary {

	public int basic;
	public float da;
	public String ename;
	public int pf;
	public double total_sal;
	
	public  salary(String ename,int basic,float da,int pf)
	{
		this.ename=ename;
		this.basic=basic;
		this.da=da;
		this.pf=pf;
	}
	public double cal_sal()
	{
		total_sal=basic+da-pf;
		return total_sal;
	}
}
