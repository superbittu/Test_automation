package Hello.com.gajannan;

public class useme {

	  public static void main( String[] args ) throws InterruptedException
	  {
		  hello hell = new hello();
		  hell.hello(10, 20);
		  
		  
	/*		 useme u1 = new useme();
			 u1.here(); 
		 System.out.println("In the main method");
		
	  }
	  
	  public void here()
	  {
		 System.out.println("In the sub method");
	  */
		  //hello h1 = new hello();
		 // h1.add(1, 3); 
		  
	} 
}

 class hello
{ int c;

   public int hello(int a,int b)
   {
	   c = a*b;
	   System.out.println("The addition of two numbers in hello method is"+c);
	return c;
	   
   }
	public int add(int a , int b)
	{  
		c= a +b;
		System.out.println(c);
		
	    return c;
		
	}
	bye hey = new bye(100,200);
	
	
}


 class bye{
	 
	 public bye(int a , int b)
	 { int c = a-b;
	   System.out.println("The substraction of two numbers in bye method is"+c);

	 }
 }