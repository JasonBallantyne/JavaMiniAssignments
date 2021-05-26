//Test Program that creates an array of four RegularPolygon objects
//
//Displaying its string representation, perimeter and area
//Calculating and displaying the smallest perimeter and largest area


package Assignment3;

public class Q2 {
	public static void main(String [] args){
//		Creating an array of four RegularPolygon objects
		RegularPolygon[] arr = new RegularPolygon[4];
		arr[0] = new RegularPolygon(3, 10.0);
		arr[1] = new RegularPolygon(6, 7.5);
		arr[2] = new RegularPolygon(8, 3.5);
		arr[3] = new RegularPolygon(12, 4.0);
		
//		Printing its string representation, perimeter and area
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//      Calculating and displaying the polygon with the smallest perimeter
		double smallPerim = arr[0].getPerimeter();
		for (int n = 1; n < arr.length; n++)
		{
			if(arr[n].getPerimeter()< smallPerim) {
				smallPerim = arr[n].getPerimeter();
			}
		}
//		Error Checking, ensuring the perimeter is not negative
		if (smallPerim < 0) {
			System.out.println("\nThe perimeter cannot be negative");
		}else {
			System.out.println("\nThe smallest perimeter is: " + smallPerim);
		}
				
		
//		Calculating and displaying the polygon with the largest area
		double maxArea = arr[0].getArea();
		for (int t = 1; t < arr.length; t++)
		{
			if(arr[t].getArea()> maxArea) {
				maxArea = arr[t].getArea();
			}
		}
		System.out.println("\nThe largest area is: " + maxArea);	
	}
}
