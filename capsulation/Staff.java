package capsulation;

public class Staff {

	private String name;
	private int id;
	private String department;
	private String designation;
	
	public void setname(String name)
	{
		this.name =name;
	}
	
	public void setid(int id)
	{
		this.id=id;
	}
	public void setdepartment(String department)
	{
		this.department=department;
	}
	public void setdesignation(String designation)
	{
		this.designation=designation;
	}
		public String getname()
		{
			return name;
		}
		public int getid()
		{
			return id;
		}
		public String getdepartment()
		{
			return department;
		}
		public String getdesignation()
		{
			return designation;
		}

		public Staff(String name, int id, String department, String designation) {
			super();
			this.name = name;
			this.id = id;
			this.department = department;
			this.designation = designation;
		}

		public Staff() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		

}
