import java.util.Scanner;
public class Area{
	public static void main(String[] args){
		double r, pi=3.142, area;
		Scanner s = new Scanner(System.in);
		System.out.print("ENTER THE RADIUS");
		r = s.nextDouble();
		area = pi*r*r;
		System.out.println("THE AREA IS "+area);
	}
}