package capsulation;

public class student {

	private String name;
	private int roll;
	private String department;
	private long mob;
	
	public void setname(String name)
	{
		this.name =name;
	}
	
	public void setroll(int roll)
	{
		this.roll=roll;
	}
	public void setdepartment(String department)
	{
		this.department=department;
	}
	public void setmob(long l)
	{
		this.mob=l;
	}
		public String getname()
		{
			return name;
		}
		public int getroll()
		{
			return roll;
		}
		public String getdepartment()
		{
			return department;
		}
		public long getmob()
		{
			return mob;
		}

		public student(String name, int roll, String department, long mob) {
			super();
			this.name = name;
			this.roll = roll;
			this.department = department;
			this.mob = mob;
		}

		public student() {
			super();
			// TODO Auto-generated constructor stub
		}

	
		
		
	

	

}
