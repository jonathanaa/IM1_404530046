
class Rectangle{
	int x,y;
	double width,height;
	double area,perimeter;
	public Rectangle(){}
	public Rectangle(int xx,int yy,double wwidth,double hheight )
	{
		x=xx;
		y=yy;
		height = hheight;
		width=wwidth;
		area= height*width;
		perimeter=(height+width)*2;
		
	}
	public double getArea()
	{
		return area;
	}
	public double getPerimeter(){
		
		return perimeter;
	}
	public String toString(){
		return "java.Rectangle[x="+ x +",y="+ y +",width="+ width +",height="+ height+"]" ;      
		
	}
	
}
public class HM1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		Rectangle rectangle1 = new Rectangle(15,25,57,18);
		Rectangle rectangle2 = new Rectangle(0,12,60,47);
		System.out.println(rectangle1);
		System.out.print("Area:");
		System.out.println(rectangle1.getArea());
		System.out.print("Perimeter:");
		System.out.println(rectangle1.getPerimeter());
		System.out.println("");
		
		System.out.println(rectangle2);
		System.out.print("Area:");
		System.out.println(rectangle2.getArea());
		System.out.print("Perimeter:");
		System.out.print(rectangle2.getPerimeter());
		System.out.println("");
		System.out.println("");
		System.out.println("End of Output!");
	

	}

}
