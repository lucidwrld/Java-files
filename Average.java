import java.util.Scanner;
public class  Average{
	public static void main(String[] args){
		Scanner value = new Scanner(System.in);
		int choice, i, sum=0 ;
		float avg;
		System.out.print("Enter the number of students scores to be inputted");
		choice = value.nextInt();
		int num[] = new int[choice];
		for(i=0;i<choice;i++){
			System.out.print("Enter score");
			num[i] = value.nextInt();
			sum += num[i];
			
		}
		avg = sum/choice;
		System.out.println("Your sum is " +sum);
		System.out.println("Your average is " +avg);
	}
}