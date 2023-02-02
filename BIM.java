import java.util.Scanner;
public class BIM{
	public static void main(String[] args){
		int height;
		double BIM, weight,kg;
		Scanner s = new Scanner(System.in);
		System.out.print("What is your weight in pounds ");
		weight = s.nextDouble();
		System.out.print("What is your height: ");
		height = s.nextInt();
		kg = weight/2.2046;
		BIM = (kg/(height*height));
		if(BIM < 20.00){
			System.out.println("Your BIM is "+BIM);
			System.out.println("you are underweight");
		}else if(BIM >=20.00 && BIM <24.00){
			System.out.println("Your BIM is "+BIM);
			System.out.println("you are too thin");
			}else if(BIM >=24.00 && BIM <=29.00){
				System.out.println("Your BIM is "+BIM);
				System.out.println("you are normal");
				}else if(BIM >=30.00 && BIM <=38.00){
					System.out.println("Your BIM is "+BIM);
					System.out.println("you are a little big");
					}else if(BIM >=39.00){
						System.out.println("Your BIM is "+BIM);
						System.out.println("you are obese");
						}
	}
}