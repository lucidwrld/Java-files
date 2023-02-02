//a program for calculating cgpa


import java.util.Scanner;
public class Total
{
	double gpa;
	public static String StudentID(String name, String matricnumber, String coursestudy, String level )
	{
		return "Welcome "+name + " "+matricnumber + " "+coursestudy + " "+level;
	}
	//for Credit unit
	static void Credunit()
	{
		double credt, credit1, credit2, credit3, credit4, credit5;
		Scanner input = new Scanner (System.in);
		System.out.println("Note A =5 , B =4, C =3, D =2, E =1, F =0 \n");
		System.out.println("Enter the credit point below:");
		credit1 = input.nextDouble();
		credit2 = input.nextDouble();
		credit3 = input.nextDouble();
		credit4 = input.nextDouble();
		credit5 = input.nextDouble();
		credt=credit1+credit2+credit3+credit4+credit5;
	}
	
	static void Points()
	{
		double uni, unit1, unit2, unit3, unit4, unit5;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the course unit below:");
		unit1 = input.nextDouble();
		unit2 = input.nextDouble();
		unit3 = input.nextDouble();
		unit4 = input.nextDouble();
		unit5 = input.nextDouble();
		uni=unit1+unit2+unit3+unit4+unit5;
}
//for calculating the cgpa
static void cgpa()
	{
			double score1, score2, score3, score4, score5;
			double gpa, gpaa, gpaaa;
			Scanner input = new Scanner (System.in);
	System.out.println("Enter the scores of the student :");
	score1 = input.nextDouble();
	score2 = input.nextDouble();
	score3 = input.nextDouble();
	score4 = input.nextDouble();
	score5 = input.nextDouble();
	
	gpa = score1 + score2 + score3 + score4 + score5;
	
	gpaa = gpa/5;
	gpaaa = gpa/100;
	System.out.println("The Average score of the student above is:"+gpaa);
	System.out.println("The Cgpa of the student above is:"+gpaaa);
	
		//return gpa/2;
	}
	
	public static void main(String[]args)
	{
		int i=0;
		for(i=0; i<=1; ++i){
			Scanner sc = new Scanner(System.in);
			//calling method 1
			String name, matricnum, course, levelll;
			System.out.println("Enter students details: ");
			name = sc.nextLine();
			matricnum = sc.nextLine();
			course = sc.nextLine();
			levelll = sc.nextLine();
			System.out.println(StudentID(name, matricnum, course, levelll));
			//calling method 2
			Points();
			//calling method 3
			Credunit();
			cgpa();
			
			
			
			
			
			
			
		}
	}
}