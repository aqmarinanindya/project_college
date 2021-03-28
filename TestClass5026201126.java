public class TestClass5026201126 {
	public static void main(String[] args) {
	ComputeMethods5026201126 obj = new ComputeMethods5026201126();
		double degreesC = obj.fToC(100.4);
		System.out.printf("Temp in celcius is %f\n", degreesC);
		double hypotenuse = obj.hypotenuse(6, 8);
		System.out.println("Hypotenuse is " + hypotenuse);
		int roll = obj.roll();
		System.out.println("The sum of the dice values is " + roll);
	}
}