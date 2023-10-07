import java.util.Scanner;
public class printerapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner( System.in );
		System.out.println("Printer app");
		System.out.println("This app is made by");
		String creator = "Gimhani";
		System.out.println("This app is made by "+creator);
		
		int number1 = myInput.nextInt();
				System.out.println("first number ="+number1);
		//well done
		int number2 =myInput.nextInt();
		System.out.println("Second number ="+number2);
		
		int multiplication = number1*number2;
				System.out.println("number1*number2 = "+multiplication); 
		int addition = number1+number2;
				System.out.println("number1 + number 2 ="+addition);
		double substraction = number1-number2;
				System.out.println("number1-number2 ="+ substraction);
		double division = number1/number2;
				System.out.println("number1/number2 ="+division);			
		
				
		
				
	}

}
