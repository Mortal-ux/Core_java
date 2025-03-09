package capsulation;

public class Nonstaff {

	private String name;
	private int id;
	private String designation;
	
	public void setname(String name)
	{
		this.name =name;
	}
	
	public void setid(int id)
	{
		this.id=id;
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
		public String getdesignation()
		{
			return designation;
		}

		public Nonstaff(String name, int id, String designation) {
			super();
			this.name = name;
			this.id = id;
			this.designation = designation;
		}

		public Nonstaff() {
			super();
			// TODO Auto-generated constructor stub
		}
		

}

