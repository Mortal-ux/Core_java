package Collection.list.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import Collection.Set.HashSet.Student;

public class MainStudent {

	public static void main(String[] args) {

		ArrayList <Student>al=new ArrayList<Student>();
		
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Shubham");
		s1.setBranch("CS");
		
		Student s2=new Student();
		s2.setId(2);
		s2.setName("Sangram");
		s2.setBranch("Mechanical");
		
		Student s3=new Student();
		s3.setId(3);
		s3.setName("Aditya");
		s3.setBranch("Civil");
		
		Student s4=new Student();
		s4.setId(4);
		s4.setName("Amey");
		s4.setBranch("AIDS");
		
		Student s5=new Student();
		s5.setId(5);
		s5.setName("Pratik");
		s5.setBranch("E&TC");
		
		Student s6=new Student();
		s5.setId(6);
		s5.setName("sarthak");
		s5.setBranch("Cyber Security");

		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		
		System.out.println(al);
		
		Iterator<Student> itr=al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------------");
		for(Student o:al) {
			System.out.println(o);
		}
	}

	}


