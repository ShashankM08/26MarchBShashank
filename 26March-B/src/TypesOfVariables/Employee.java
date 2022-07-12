package TypesOfVariables;

public class Employee 
{
     
	// Name, ID, Department ,Salary, Grade
	
	String emp_name;
	int emp_id;
	String emp_dept;           // Global variables are always written inside class and outside method
	float emp_sal;
	char emp_grade;
	
	
	public void emp_info()
	{
		System.out.println("====================");
		System.out.println("Employee name is "+emp_name);
		System.out.println("Employee id is is "+emp_id);
		System.out.println("Employee department is "+emp_dept);
		System.out.println("Employee salary is "+emp_sal);
		System.out.println("Employee grade is "+emp_grade);
		System.out.println("====================");
	}
}
