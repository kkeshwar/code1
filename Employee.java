public class Employee
{
	String ename;
	int ecode;
	public Employee()
	{
	ename="K.Karthikeshwar";
	ecode=1852;
	}
	public void disp()
	{
	System.out.println("Employee Name = "+ename);
	System.out.println("Employee Code = "+ecode);
	}	
	public static void main(String args[])
	{
	Employee emp=new Employee();
	emp.disp();
	}
}