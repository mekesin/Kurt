package Kurt;

import java.util.Scanner;

public class Pra {

	public static void main(String[] args) {
		System.out.println("Input Number :");
		
		Scanner scanner= new Scanner(System.in);
		int inputNum = scanner.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(inputNum*i);
		}
		scanner.close();
	}
}