package week4;

import java.util.ArrayList;
import java.util.Scanner;

import acm.program.ConsoleProgram;

public class NameCounts extends ConsoleProgram {
	
	public void run() {
		 Scanner input = new Scanner(System.in);
         ArrayList <String> list = new ArrayList<String>();
	            
         		
         	System.out.println("Enter name:");
	            list.add(input.nextLine());
	            System.out.println("Enter name:");
	            list.add(input.nextLine());

	            System.out.println("Enter name:");
	            list.add(input.nextLine());

	            System.out.println("Enter name:");
	            list.add(input.nextLine());
	            System.out.println("Enter name:");
	            list.add(input.nextLine());
	            System.out.println("Enter name:");
	            list.add(input.nextLine());
	            System.out.println("Enter name:");
	            list.add(input.nextLine());
	            System.out.println("Enter name:");
	            list.add(input.nextLine());

	          boolean isThere = true;
	            
	          
	          for (String g : list) {

	                if( input == null ) {
	                isThere = false;
	                return;
	                }

	               System.out.println("-------------------------------");
	                System.out.println(g);


	            }
		
	}
}
		
		
	
	
