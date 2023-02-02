import java.util.Scanner;
public class Money{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int matric,choice, i, sum=0;
		String name;
		float avg;
		double money , ten, total;
		System.out.print("Enter your name \n");
		name = input.nextLine();
		System.out.print(" \n");
		System.out.print("Enter your Matric number \n");
		matric = input.nextInt();
		System.out.print(" "+name);
		System.out.print("\n ");
		System.out.print("\n");
		System.out.print(" "+matric);
		System.out.print("\n ");
	

		
		System.out.print("Enter the number of course scores to be inputted");
		choice = input.nextInt();
		System.out.print("\n ");
		int num[] = new int[choice];
		for(i=0;i<choice;i++){
			System.out.print("\n ");
			System.out.print("Enter score  ");
			num[i] = input.nextInt();
			System.out.print(" \n");
			sum += num[i];
			
		}
		avg = sum/choice;
		System.out.print("\n ");
		System.out.print(" ");
		System.out.println("Your average is " +avg);
		System.out.print("\n ");
		System.out.print("\n ");
		System.out.print("\n ");
			
			
			System.out.print("Enter the amount");
			money = input.nextDouble();
			ten = money*0.1;
			total = money + ten;
			System.out.print(" \n");
			System.out.print(" \n");
			System.out.print("\n ");
			System.out.print("Enter the take home is" +total);
	}
}
