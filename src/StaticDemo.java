class Rectangle{
			static int getArea(int a, int b ) {
			 return a * b;
			}
			 }
	public class StaticDemo {
	public static void main(String[] args)
	{
		// Rectangle s1 = new Rectangle();
        //int A = s1.getArea(12,15);
		// demo for static method
		int A = Rectangle.getArea(12 ,15);
		System.out.println( "Area :" + A);
		
	
		

		
	}
    }