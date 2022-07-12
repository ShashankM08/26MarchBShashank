package stringClassStudy;

public class StringUse1 {

	public static void main(String[] args) 
	
	{

		// 1. length () method use
		// It returns only INTEGER VALUE
		String name= "Velocity";       // Obj name is---> name
		String city= new String ("Pune");  // Obje name is---> city
		
		System.out.println(name.length()); // Only you can see output, can't use
		System.out.println(city.length()); // Only you can see output, can't use


		int output = name.length();  // both side integer value is there
		System.out.println("Length of string is "+output);
		
		int output1 = city.length();
		System.out.println("Lenght of string is "+output1);
		
		System.out.println("=========================================");
		
		// 2. toUpperCase () method use
		// It returns STRING VALUE
		String a= "Velocity";
		System.out.println(a);   // It return as it is
		System.out.println(a.toUpperCase());	// It return VELOCITY
		
		System.out.println("==========================================");
		
		// 3. toLowerCase () method use
		String b= a.toUpperCase();
		System.out.println(b);
		System.out.println(b.toLowerCase());
		
		String c= b.toLowerCase();  // We can use this
		System.out.println(c);
		
		
		System.out.println("==========================================");
		
		// 4. equals () method use
		
		String a1= "Velocity";  // Only one object created because new keyword use
		String a2= "Velocity";
		String a3=new String("Velocity");  // Two object created because of new keyword
		String a4=new String("Velocity");
		
		
		// == compared the memory location that will not compare string content
		System.out.println(a1==a2);   // TRUE--> == then true and if not then false
		System.out.println(a3==a4);   // FALSE--> because it is not equals to
		System.out.println(a1==a3);
		
		System.out.println("==========================================");
		
		
		
		// 4. .equals () method use
		// It compares content
		//a.equals(a2); 
		// It returns Boolean Value
		System.out.println(a1.equals(a2));   // TRUE--> it compares the content present inside
		System.out.println(a1.equals(a3));   // TRUE
		System.out.println(a1.equals(a4));   // TRUE
		System.out.println(a1.equals(a2));   // TRUE
		
		
		
		System.out.println("===========================================");
		
		
		// 5. .equalsIgnoreCase () method use
		// It check only character small or capital does not matters
		String a5=new String("velocity");   // Small velocity
		System.out.println(a1.equals(a5));    // FALSE
		System.out.println(a1.equalsIgnoreCase(a5));   //TRUE
		
		
		System.out.println("===========================================");
		
		
		// 6. contains () method use
		// It returns Boolean Value
		String b1="Velocity";
		System.out.println(b1.contains("lo"));   // TRUE
		boolean Result = b1.contains("lo");
		System.out.println("Result is "+Result);
		System.out.println(b1.contains("city"));
		System.out.println(b1.contains("ec"));
		
		
		System.out.println("============================================");
		
		
		// 7. isEmpty () method use
		// It returns INTEGER value
		String m= "Pune";   // Length--> 4
		String n= "";  // Length--> 0
		String l= " "; // Length--> 1
		String o= null;  // Length--> NULL (Null printer exception)
		
		System.out.println(m.length());  // Length--> 4
		System.out.println(n.length());  // Length--> 0
		System.out.println(l.length());  // Length--> 1
	//System.out.println(o.length());  // Length--> NULL (Null printer exception)
		
		
		System.out.println("=============================================");
		
		
		
		// isBlank
		// It return BOOLEAN value
		System.out.println(m.isBlank());
		System.out.println(n.isBlank());
		System.out.println(l.isBlank());
    //System.out.println(o.isBlank());
		
		
		System.out.println("==============================================");
		
		
		// 8. chatAt method() use
		String p= "INDIA";
		System.out.println(p.charAt(3));  // 3
		
		 char requiredChar = p.charAt(0);  // To use this we defined local variable
		System.out.println(requiredChar);
		
		//System.out.println(p.charAt(-1));   // String Index out of Boundary Exception
		//System.out.println(p.charAt(9));  // String Index out of Boundary Exception
		
		System.out.println("===============================================");
		
		// 9. endsWith method () use
		// It returns BOOLEAN value
		String e= "Velocity";
		System.out.println(e.endsWith("ty"));
		System.out.println(e.endsWith("city"));  //True
		System.out.println(e.endsWith("City"));  //False because alphabet is in lower case
		System.out.println(e.endsWith("cy"));
		
		
		System.out.println("================================================");
		
		
		
		// 10. startsWith method() use
		// It returns BOOLEAN value
		e.endsWith("ve");
		System.out.println(e.startsWith("ve"));
		System.out.println(e.startsWith("Ev"));
		
		// Select 2nd option in startsWith
		System.out.println(e.startsWith("loc", 0));
		System.out.println(e.startsWith("loc", 2));
		
		
		System.out.println("=================================================");
		
		
		// 11. subString method() use
		String test = "Velocity Corporate Training Centre";
		System.out.println(test.substring(9));
		
		String mystring = test.substring(9);  // Now we can use this
		System.out.println(mystring);
		
		System.out.println(test.substring(9, 17));  // CORPORAT
		System.out.println(test.substring(9, 18));  // CORPORATE
		
		
		
		System.out.println("==================================================");
		
		
		// 12. concat method() use
		// To join two strings
		
		String X="Pune";
		String Y="City";
		System.out.println(X.concat(Y));  // PuneCity
		System.out.println(X.concat(" ").concat(Y));  // Pune City means with space
		
		
		System.out.println("==================================================");
		
		
		// 13. indexOf method() use
		// It shows the location of character
		String h= "INDIA";
		System.out.println(h.indexOf('A'));
		System.out.println(h.indexOf('I'));   // Here two I are there so it gets the first I which is at 0th place
		
		
		System.out.println("===================================================");
		
		
		
		// 15. replace method() use
		// to replace something
		String j= "Automation Testing";
		System.out.println(j.replace('t', 'm'));  // Option 1
		
		
		System.out.println(j.replace("ti", " "));  // Option 2
		
		
	
	}

}
