/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */
import java.util.Scanner;
public class ProblemSet2 {
	Scanner in = new Scanner(System.in);
	/**
	 * You need not modify the main method.
	 */
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	// fix this later
	public void sayHello() {

		System.out.println("Please enter first name");
		String text = in.nextLine();
		System.out.println("Please enter last name");
		String text2 = in.nextLine();
		System.out.println(text + " " + text2);
	}
	
	public void gradeMe() {
		Scanner in = new Scanner(System.in);
		System.out.println("\nPlease enter homework scores");
		double texthomework1 = in.nextDouble();
		double texthomework2 = in.nextDouble();
		double texthomework3 = in.nextDouble();
		System.out.println("Please enter quiz scores");
		double textquiz1 = in.nextDouble();
		double textquiz2 = in.nextDouble();
		double textquiz3 = in.nextDouble();
		System.out.println("Please enter test scores");
		double texttest1 = in.nextDouble();
		double texttest2 = in.nextDouble();
		double texttest3 = in.nextDouble();
		double averageHomework=(texthomework1 + texthomework2 + texthomework3)/3;
		double averageQuiz = (textquiz1 + textquiz2 + textquiz3)/3;
		double averageTest = (texttest1 + texttest2 + texttest3)/3;
		double avgAll = averageHomework * .15 + averageQuiz * .3 + averageTest * .55;
		System.out.println(String.format("%.2f", avgAll));
	}

	public void groupUs() {
		Scanner in = new Scanner(System.in);
		System.out.println("\nPlease enter students");
		int students = in.nextInt();
		System.out.println("Please enter teachers");
		int teachers = in.nextInt();
		int total = students + teachers;
		int busses;
		if (total%47 > 0) {
			busses = total/47;
			int people = total%47;
			System.out.println("you will need " + busses + " full busses and 1 bus with " + people + " people on it");
		}else{
			busses = total/47; 
			System.out.println("you will need " + busses + " busses");
			System.out.println("There will be " + busses + " full busses");
		}
		
	}
	
	public void info() {
		Scanner in = new Scanner(System.in);
		System.out.println("\nPlease enter your name (First Last)");
		String name = in.nextLine();
		System.out.println("Please enter your grade");
		String grade= in.nextLine();
		System.out.println("Please enter your age");
		String age = in.nextLine();
		System.out.println("Please enter your hometown");
		String hometown = in.nextLine();
		System.out.println("NAME     : " + name);
		System.out.println("GRADE    : " + grade);
		System.out.println("AGE      : " + age);
		System.out.println("HOMETOWN : " + hometown);
	}
	
	public void initials() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nPlease enter your first name: ");
		String firstName = in.nextLine();
		System.out.print("Please enter your middle name: ");
		String lastName = in.nextLine();
		System.out.print("Please enter your last name: ");
		String actuallastName = in.nextLine();
		char firstinit = Character.toUpperCase(firstName.charAt(0));
		char midinit = Character.toUpperCase(lastName.charAt(0));
		char lastinit = Character.toUpperCase(actuallastName.charAt(0));
		System.out.println("your initials are: " + firstinit + midinit + lastinit);
		in.close();
	}
}