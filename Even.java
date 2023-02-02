import java.util.Scanner;
public class Even{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int start, end, i;
		System.out.print(" Enter the number to start from " );
		start = input.nextInt();
		System.out.print(" Enter the number to end from " );
		end = input.nextInt();
		for(i=start; i<=end ; i++){
			if(i%2==1)
			continue;
			System.out.print(" " +i);
		}
	}
}