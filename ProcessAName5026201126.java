import java.util.Scanner;
public class ProcessAName5026201126{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Type your name: ");
		String name = scan.nextLine();
		int space = name.indexOf(' ');
		String result = name.substring(space + 1) + ", " + name.charAt(0) + ".";
		System.out.println("Your name is: " + result);
}
}

