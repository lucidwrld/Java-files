import java.util.Scanner;
public class Worker{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int basic=60000, level;
		double bonus, total;
		System.out.print(" Enter your level :- \n");
		level = input.nextInt();
		if(level>=1 && level<=5){
			bonus = basic*0.1;
			total = basic + bonus;
			System.out.print(" The total take home is :- " + total);
		}else{
			if(level>=6 && level<=10){
				bonus = basic*0.15;
				total = basic + bonus;
				System.out.print(" The total take home is :- " + total);
			}else{
				if(level>=11 && level<=15){
				bonus = basic*0.20;
				total = basic + bonus;
				System.out.print(" The total take home is :- " + total);
			}else{
				if(level>=16 && level<=20){
				bonus = basic*0.25;
				total = basic + bonus;
				System.out.print(" The total take home is :- " + total);
			}else{
				System.out.print("Enter a valid level");
			}
			}
			}
		}
		}
	}
