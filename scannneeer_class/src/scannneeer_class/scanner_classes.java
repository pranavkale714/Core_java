package scannneeer_class;

import java.util.Scanner;

public class scanner_classes {

	public static void main(String[] args) {
		System.out.println("scanner class is provided by java.util package");
		Scanner sc = new Scanner(System.in);
		    String name=sc.nextLine();
			System.out.println(name);
			int a=sc.nextInt();
			System.out.println(a);
			Double tv=sc.nextDouble();
			System.out.println(tv);
			float d=sc.nextFloat();
			System.out.println(d);
		

	}

}
