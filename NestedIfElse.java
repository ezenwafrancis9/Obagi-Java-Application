import java.util.Scanner;

public class NestedIfElse{
	public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
		  
		System.out.print("Enter name: ");
		String name = input.nextLine();
		  
		System.out.print("Enter mark: ");
		int mark = input.nextInt();
		  
		if(mark > 100){
			System.out.println("Mark can not be greater than 100");
		}
		else{
		  
		if(mark >= 80){
			System.out.printf("Candidate name: %s%n",name);
			System.out.printf("Candidate mark: %d%n",mark);
			System.out.printf("Candidate Grade: %C",'A');
			  
	    }
		else if(mark >= 70){
			System.out.printf("Candidate name: %s%n",name);
			System.out.printf("Candidate mark: %d%n",mark);
			System.out.printf("Candidate Grade: %C",'B');
		}
		else if(mark >=60){
			System.out.printf("Candidate name: %s%n",name);
			System.out.printf("Candidate mark: %d%n",mark);
			System.out.printf("Candidate Grade: %C",'C');
		}
		else if(mark >=50){
			System.out.printf("Candidate name: %s%n",name);
			System.out.printf("Candidate mark: %d%n",mark);
			System.out.printf("Candidate Grade: %C",'D');
		}
		else if(mark >=40){
			System.out.printf("Candidate name: %s%n",name);
			System.out.printf("Candidate mark: %d%n",mark);
			System.out.printf("Candidate Grade: %C",'E');
		}
		else{
			System.out.printf("Candidate name: %s%n",name);
			System.out.printf("Candidate mark: %d%n",mark);
			System.out.printf("Candidate Grade: %C",'F');
		 }
	  }	 
    }
}