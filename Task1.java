import java.util.*;
class Task1
{
	public static void main(String args[])
	{
	
		
		System.out.println();
		System.out.println("7  8  9  d  C\n");
		System.out.println("4  5  6  x  /\n");
		System.out.println("1  2  3  +  -\n");
		System.out.println("0  .   ");
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println();
		int a = scan.nextInt();
		
		System.out.println();
		int b = scan.nextInt();
		
		int c = a+b;
		System.out.println(c);
		*/
		
		char choice ;
		
		do 
		{
			System.out.println();
			int a= scan.nextInt();
			System.out.println();
			choice = scan.next().charAt(0);
			System.out.println();
			int b=scan.nextInt();
			
			switch(choice)
			{
				case '+':
					System.out.println(a+b);
					break;
				
				default:
					break;
			}
			
		}
		while(choice!='C');
	}
}
	
















