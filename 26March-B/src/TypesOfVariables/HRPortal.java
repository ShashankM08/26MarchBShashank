package TypesOfVariables;

public class HRPortal {

	public static void main(String[] args) 
	{
		Employee SachinT= new Employee(); //Object created
		Employee ViratK = new Employee();  //Object created
		
		SachinT.emp_info(); // Calling
		ViratK.emp_info();  // Calling
		
		SachinT.emp_name="Sachin Tendulkar";
		SachinT.emp_dept= "Batting";
		SachinT.emp_id=10;
		SachinT.emp_grade='A';
		SachinT.emp_sal= 123.12f;
		
			
		ViratK.emp_name= "Virat Kohli";
		ViratK.emp_dept= "Batting";
		ViratK.emp_id= 10;
		ViratK.emp_grade='A';
		ViratK.emp_sal=152.2f;
		
		
		
		
		
	
		
		
        
	}

}
