
public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Operators in Java can be classified into 5 types:

				1.Arithmetic Operators
				2.Assignment Operators
				3.Relational Operators
				4.Logical Operators
				5.Unary Operators
				6.Bitwise Operators 
		*/
		System.out.println("<========== Arithmetic Operators=====>  ");
		//declare variable
		int a = 12,b=5;//=
		int add=a+b;//+
		int sub=a-b;//-
		int mul=a*b;//*
		int div=a/b;// /
		int modulo = a%b;//%
		
		System.out.println("Add=====>  "+add);
		System.out.println("Sub=====>  "+sub);
		System.out.println("Mul=====>  "+mul);
		System.out.println("Div=====>Divident  "+div);
		System.out.println("Mod=====>Remainder  "+modulo);
		
		//+= | -= | *= | /= | %=
		
		a= a+b;//17
		System.out.println("+=  ...............   "+a);
		a= a+b;//17+5
		System.out.println("+=  ...............   "+a);
		
		a= a-b;//17
		System.out.println("-=  ...............   "+a);
		a= a-b;//17-5
		System.out.println("-=  ...............   "+a);
		
		a= a*b;//17
		System.out.println("*=  ...............   "+a);
		a= a*b;//17-5
		System.out.println("*=  ...............   "+a);
		
		
		a= a/b;//17
		System.out.println("/=  ...............   "+a);
		a= a/b;//17-5
		System.out.println("/=  ...............   "+a);
		
		a= a%b;//17
		System.out.println("%=  ...............   "+a);
		a= a%b;//17-5
		System.out.println("%=  ...............   "+a);
		
		
		System.out.println("<========== Assignment Operators=====>  ");
		
		int a1 = 4;
		int varbl;
		
		varbl= a1;//varbl=4 & a1=4
		System.out.println("var using = : "+varbl );
		
		varbl +=a1;//varble=varble+a1 //4+4=8
		System.out.println("var using += :" +varbl );
		
		varbl *=a;//varble=varble*a1 //4*4=16
		System.out.println("var using *= :" +varbl );
		
		
		System.out.println("<========== Relational Operators=====>  ");
		
		int relA=7,relB=11;
		
		System.out.println("A: "+relA+" & B: "+relB);
		System.out.println("==  "+ (relA == relB) );
		System.out.println("!=  "+ (relA != relB) );
		System.out.println(">   "+ (relA > relB) );
		System.out.println("<   "+ (relA < relB) );
		System.out.println(">=  "+ (relA >= relB) );
		System.out.println("<=  "+ (relA < relB) );
		
		
		System.out.println("<========== Logical Operators=====>  ");
		
		// && Operator
		 System.out.println("&& Op "+ ((5 > 3) && ( 8 > 5)));//true && true ====> true
		 System.out.println("&& Op "+ ((5 > 3) && ( 8 < 5)));//true && false ====> false
		// || Operator
		 
		 System.out.println("|| Op "+ ((5 < 3) || ( 8 > 5)));//false || true ====> true
		 System.out.println("|| Op "+ ((5 > 3) || ( 8 < 5)));//true || false ====> true
		 System.out.println("|| Op "+ ((5 < 3) || ( 8 < 5)));//false || false ====> false
		 
		 
		// ! Operator
		 System.out.println("! Op "+ (!(5 == 3)));//!false   ====> true
		 System.out.println("! Op "+ (!( 5 > 3)));//!true     ====> false
		 
		 System.out.println("<========== Unary Operators=====>  ");
		 
		 int num=5;
		 ++num;//num+1
		 System.out.println(num);
		 
		    int n1 = 12, n2 = 12;
		    int result1, result2;

		    // original value
		    System.out.println("Value of n1: " + n1);

		    // increment operator
		    result1 = ++n1;
		    System.out.println("Prefix After increment: " + result1);
		    
		    result1 = n1++;

		    System.out.println("PostFix of result1: " + result1);
		    System.out.println("n1: " + n1);

		    // decrement operator
		    result2 = --n2;
		    System.out.println("Prefix After decrement: " + result2);
		    
		    result2 = n2--;
		    System.out.println("PostFix decrement: " + result2);
		    System.out.println("n2: " + n2);
		 
		
		    System.out.println("<========== Bitwise Operators=====>  ");
		    /* 
		      
		      
		    Operator	Description
		    ~	Bitwise Complement
		    <<	Left Shift
		    >>	Right Shift
		    >>>	Unsigned Right Shift
		    &	Bitwise AND
		    ^	Bitwise exclusive OR
		    
		    not used in java
		    */
		    
		    
		    System.out.println("<========== Ternary Operators=====>  ");
		    //Syntax : variable = Expression ? expression1 : expression2;
		    
		    int FebDays = 29;
		   boolean bool = false;
		    
		    String result;
		    
		    result = (FebDays == 29)? "Not a leap year" : "Leap Year";//Statement 1 will be executed
		    
		    System.out.println("Statement 1 will be executed ==>"+result);
		    
		    result = (bool)? "Not a leap year" : "Leap Year";//Statement 1 will be executed
		     
		    System.out.println("Statement 2 will be executed ==>"+result);
		    
		    
		    System.out.print("TEST next line print \n");
		    System.out.print("TEST 2");

		
	}

}
