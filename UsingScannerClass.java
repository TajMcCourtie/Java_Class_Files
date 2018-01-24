import java.util.Scanner;
public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double radius;
		 double area;
		 double square_area;
		 
		 Scanner sc= new Scanner (System.in);
		
		/* System.out.println("Enter Square Length");
		 int L = sc.nextInt();
		 
		 System.out.println("Enter Square Width");
		 int W = sc.nextInt();
		 
		 System.out.println("Please enter first name");
		 String first_name = sc.next();
		 
		 //Assign a radius
		 radius = 20; //New value is radius
		 
		 //Compute area
		 area = radius * radius * 3.14159;
		 
		 //Compute area of a square
		 square_area = L * W;
		 
		 //Display results
		// System.out.println("The area for the circle of radius" + " " + radius + " " + "is" + " " + area);
		 System.out.println("The area for the square" + " "+ L + " " +  W + " " + "is" + " " + square_area);
		 System.out.println("The name entered is"+ " " + first_name );*/
		
		 String input = "10 tea 20 coffee 30 tea biscuits";
		 Scanner s = new Scanner(input).useDelimiter("\\s");
		 System.out.println(s.nextInt());
		 System.out.println(s.next());
		 System.out.println(s.nextInt());
		 System.out.println(s.next());
		 
		 		 
		 sc.close();
	}

}
