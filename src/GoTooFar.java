import java.util.Scanner;

public class GoTooFar {
	GoTooFar() {
		System.out.println("GoTooFar deafult constructor");
	}

	int myArr[] = new int[5];
	
	public static void main(String args[]) throws ScoreException {
		GoTooFar gtf = new GoTooFar();
		Scanner sc = new Scanner(System.in);
		// Solution 1
		try {
			System.out.println("\n*****************My Solution One*****************");
			for(int i = 0; i < gtf.myArr.length; ) {
				i++;
				System.out.println(gtf.myArr[i]);
			}
			
		} catch(ArrayIndexOutOfBoundsException ae) {
			System.err.println("ArrayIndexOutOfBoundsException encountered: Now you've gone too far");
		} catch(Exception e) {
			System.err.println("Exception: "+e);
		}
		
		// Solution 2
		String myStr = "{abc}";
		try {
			System.out.println("\n*****************My Solution Two*****************");
			System.out.println(Integer.parseInt(myStr));
		} catch (NumberFormatException ne) {
			System.err.println("NumberFormatException encountered: The string cannot be converted to a number");
		} catch(Exception e) {
			System.err.println("Exception: "+e);
		}
		
		// Solution 3
		try {
			System.out.println("\n*****************My Solution Three*****************");
			System.out.println("Please enter the array size");
			int size = sc.nextInt();
			int arr[] = new int[size];
			System.out.print("My array: ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+ ", ");
			}
		} catch (NegativeArraySizeException ne) {
			System.err.println("NegativeArraySizeException encountered: You cannot create an array with the entered size");			
		} catch(Exception e) {
			System.err.println("Exception: "+e);
		}
		
		// Solution 4
		try {
			System.out.println("\n*****************My Solution Four*****************");
			System.out.println("Please enter a number");
			double number = sc.nextDouble();
			double sqrtNumber= Math.sqrt(number);
			System.out.print("The square root of the entered number is: "+sqrtNumber);
			// Adding an example of Arithmetic exception
			double dividedAns = number/0;
			System.out.println("Attempting to divide a number by 0"+dividedAns);			
		} catch (ArithmeticException ne) {
			System.err.println("ArithmeticException encountered: You cannot create an array with the entered size");			
		} catch(Exception e) {
			System.err.println("Exception: "+e);
		}
		
		// Solution 5
		System.out.println("\n*****************My Solution Five*****************");
		try {
			System.out.println("\nCreating an employee with hourly wage $5.00");
			Employee emp1 = new Employee(1,5);
		} catch (Exception e) {
			System.err.println("Exception encountered: "+e);
		}
		try {
			System.out.println("\nCreating an employee with hourly wage $15.00");
			Employee emp2 = new Employee(1,15);
		} catch (Exception e) {
			System.err.println("Exception encountered: "+e);
		}
		try {
			System.out.println("\nCreating an employee with hourly wage $55.00");
			Employee emp3 = new Employee(1,55);
		} catch (Exception e) {
			System.err.println("Exception encountered: "+e);
		}
		
		// Solution 5
		System.out.println("\n*****************My Solution Six*****************");
		Student s = new Student();
		for (int i = 0; i < s.getStudentIds().length; i++) {
			try {
				System.out.println("\nEnter student score");
				int score = sc.nextInt();
				if(score <= 100) {
					throw new ScoreException();
				} else {
					System.out.println("The student's score is: " + score);
				}	
			} catch (Exception e) {
				System.err.println("Exception encountered: "+e);
			}
						
		}
		
	}
}
