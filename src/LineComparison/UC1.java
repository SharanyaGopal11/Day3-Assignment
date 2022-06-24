package LineComparison;

import java.util.Scanner;

public class UC1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Welcome to the line comparison computation");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of x1 and x2");
        float x1 = scanner.nextFloat();
        float x2 = scanner.nextFloat();
        System.out.println("enter the value of y1 and y2");
        float y1 = scanner.nextFloat();
        float y2 = scanner.nextFloat();
        double length = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("length of the line is "+length);
	}

}
