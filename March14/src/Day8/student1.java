package Day8;

class student
{
	int sid;
	String sname;
	student()
	{
		sid=10;
		sname="Nandini";
	}
	student(int i,String n)
	{
		sid=i;
		sname=n;
	}
	void display()
	{
		System.out.println("stuid="+sid);
		System.out.println("stuname="+sname);
	}
}
class student1
{
	public static void main(String args[]) 
	{
		student s1=new student();
		student s2=new student(20,"Priya");
		s1.display();
		s2.display();
		
	}
}