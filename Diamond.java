interface Interface1  
{  
   default void display()  {  
	   System.out.println("Interface 1");  
   }  
}  

interface Interface2  
{  
	default void display()  {  
		System.out.println("Interface 2");  
	}  
}  

public class Diamond implements Interface1, Interface2  
{  
	public void display()  {  
		Interface1.super.display();  
		Interface2.super.display();  
	}  
	public static void main(String args[])  {  
		Diamond d = new Diamond();  
		d.display();  
	}  
}  