package classLab3;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int areaNum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Would you like to find the area of a triangle Y/N");
		String str = sc.next();
		if ( str == "y" || str == "Y") {
			System.out.println("Enter Length");
			double length = sc.nextDouble();
			System.out.println(" Width? ");
			double width = sc.nextDouble();
			double area = (length * width) / 2;
			System.out.println(" Area: " + area);
		}
			else {
				System.out.println("Goodbye");
			}
			
		System.out.println(" Would you like to find the area of another rectangle? Y");
		String str1 = sc.next();
			if (str1 == "y" || str1 == "Y") {
				areaNum++;
				continue;
				}		
			System.out.println(" Thank you for creating" + areaNum + " Areas with our program");

		sc.close();
			
			}
	}
			


		






