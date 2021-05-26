/*Implementation of a Regular Polygon class that contains:
	A data field named n that defines the number of sides in the polygon (default value 3).
	A data field named length that stores the length of each side (default value 1).
	A no-arg constructor that creates a regular polygon with default values
	A constructor that creates a regular polygon with the specified number of sides and length of
	side.
	Getter (accessor) and setter (mutator) methods for all data fields.
	A method named getPerimeter() that returns the perimeter of a polygon
	A method named getArea()that returns the area of a polygon.
	A toString() method that returns a string representation of a polygon (i.e. returns the values
	of the data fields as a string).
*/
		
package Assignment3;
public class RegularPolygon {
	 
    // Declare and initialize default values.
    private int n       = 3;
    private double length = 1.0;
   
 
        // Create constructor with default values.
        public RegularPolygon(){
 
        }
 
        // Create constructor with new n and length values.
        public RegularPolygon(int n, double length){          
            this.n      = n;
            this.length   = length;
            
        }
 
        // get n method
        public int getN(){
            return this.n;
        }
 
        // set n method.
        // Error checking that side is not negative
        public void setN(int n){
        	if (n < 0 ) {
        		System.out.println("Side cannot be less than 0");	
        	}else {
        		this.n  = n;
        	}   
        }
 
        // get length method.
        public double getlength(){
            return this.length;
        }
 
        // set length method.
        // Error checking that length is not negative
        public void setlength(double length){
        	if (length < 0 ) {
        		System.out.println("Length cannot be less than 0");	
        	}else {
            this.length = length;
        	}
        }
 
        // Calculate Perimeter.
        public double getPerimeter(){
            return this.n * this.length;
        }
 
        // Calculate Area.
        public double getArea(){
            return (this.n * Math.pow(this.length,2)) / (4 * Math.tan(Math.PI/this.n));
        }
 
        // String Representation method of RegularPolygon object.
        public String toString(){
            String result;
            if(this.n >= 0 && this.length >= 0){
                result = "Polygon sides: " + this.n + ", Length: "+ this.length + ", Area: " + this.getArea() + ", Perimeter: " + this.getPerimeter();
            }else if(this.n >= 0 && this.length < 0){
                result = "The length must not be negative.";
            }else if(this.n < 0 && this.length >= 0){
                result = "The number of sides must not be negative.";
            }else{
                result = "Neither the number of sides or the length of the sides can be negative.";
            }
            return result;
        }
 
}
