
import java.util.Scanner;

public class Basics4_Loops {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int i = 1;
// WHILE AND IF
// difference between the 'while' and 'for' loop: loop iterator/counter (i++) is created outside of the loop structure
		while (i <= 20) // 1 through 20
		{
			
			if (i == 3) // skip 3 and add 2 to make 5 and continue from there
			{
				i+=2; 
				continue;
			}
			
			System.out.println(i);
			i++;
			
			if ((i%2) == 0) // using if statement to only print odd numbers
			{
				i++;
			}
			
			if(i > 10) // stop when 10 is reached
			{
				break;
			}
		}
		
		double myPi = 4.0;
		double j = 3.0;
		
		
// execute while loop until user decides to stop
// --> need to insert scanner on top
		
		String contYorN = "Y";
		
		int h = 1;
		
		while (contYorN.equalsIgnoreCase("y"))
		{
			System.out.println(h);
			System.out.print("Continue y or n?");
			contYorN = userInput.nextLine();
			h++;
			
		}
		
// DO WHILE: used when you want code to be run at least 1x (not used very commonly)
		
		int k = 1;
		
		do
		{
			System.out.println(k);
			k++;
		} while (k < 10); // will always print out what k has been initially set as, even if k greater than 10
		
		
// FOR (declare iterator; conditional statement; change iterator)
		
		for (int l=10; l >= 1; l--)
		{
			System.out.println(l);	// must be inside for statement
		}
		
		int m, n;
		
		for (m=1, n=2; m <=9; m+=2, n+=2)
		{
			System.out.println(m + "\n" + n);
			
		}
		
	}
}

