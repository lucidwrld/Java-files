import java.util.Scanner;
public class Fact{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int i,num, fact=1;	
		System.out.print(" Enter the number :- ");
		num = input.nextInt();
		for(i=1; i<=num; i++){
			fact=fact*i;
		}
		System.out.print("The factorial :- " +fact);
	}
}