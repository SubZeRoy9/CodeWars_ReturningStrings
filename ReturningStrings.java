import java.util.Scanner;

public class ReturningStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello, please enter your name...");
		String name = scan.next();
		System.out.println(greet(name));
		scan.close();

	}
	  public static String greet(String name) {
	    return "Hello, " + name + " how are you doing today?";
	  }
	}
