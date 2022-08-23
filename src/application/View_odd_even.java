package application;

import java.util.Scanner;

public class View_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite um número para descobrir se é par/impar: ");
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int resto_number = number % 2;
		
		if (resto_number == 0){
			System.out.printf("par");			
		}else {
			System.out.printf("impar");
		}
		sc.close();
	}

}
