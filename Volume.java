import java.util.Scanner;
public class Volume{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double pre, pree, vol, voll;
		System.out.print(" Enter your value for Pressure 1 ");
		pre = input.nextDouble();
		System.out.print(" Enter your value for Pressure 2 ");
		pree = input.nextDouble();
		System.out.print(" Enter your value for Volume 2 ");
		voll = input.nextDouble();
		vol = (pree * voll)/pre;
		System.out.print(" Your value for Volume 1 is  "+vol);
	}
}