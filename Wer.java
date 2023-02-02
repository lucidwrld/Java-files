import java.util.Scanner;
import java.lang.Math;
public class Wer{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double number, power;
		System.out.print(" Enter the number :- ");
		number = input.nextDouble();
		System.out.print(" Enter the power :- ");
		power = input.nextDouble();
		System.out.print(Math.pow(number, power));
	}
}