
public class Square  extends Shape{

	@Override
	public void area() {
		// TODO Auto-generated method stub
	double s =5.6 ,a;
	   a =  (s * s );
	    Double  a1 = a;
	    System.out.println(" Area of Square : " + a1.floatValue());
		}

	@Override
	public void noOfSides() {
		// TODO Auto-generated method stub
		System.out.println("No Of Sides For Square :" + 4);
		}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
	     double p = (4 * 5.6);
	     float p1  =(float) p;
	    System.out.println("Perimeter of Square :" + p1);
		}
    
	@Override
	public void diagonalOfSquare() {
		// TODO Auto-generated method stub
		double  d  =  (Math.sqrt(2 )* 5.6);
		double d1 = Math.round(d * 100.0) / 100.0;
		// double  d1= Math.round ((d*100)/100);
         System.out.println("Diagonal Of A Square :" + d1);
		//System.out.printf("Diagonal Of A Square : " +  d);
		}
	public static void main(String[] args) {
		 Square squareobj = new Square();
		 //Shape squareobj = new Square();
		 squareobj.area();
		 squareobj .perimeter();
	     squareobj.diameter(0);
		 squareobj.diagonalOfSquare();
	     squareobj .noOfSides();
			 
	}

}
