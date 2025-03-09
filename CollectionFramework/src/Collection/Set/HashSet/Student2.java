package Collection.Set.HashSet;

public abstract class Student2 implements Comparable<Object>{
	
		private int id;
		private String name;
		private String Branch;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBranch() {
			return Branch;
		}
		public void setBranch(String branch) {
			Branch = branch;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", Branch=" + Branch + "]";
		}
		public int compareTo(Student2 o) {
			
			int i=this.getName().compareTo(o.getName());
			return i;
		}	
	}


