
class Rectangle{
	int x,y;
	double width,height;
	public Rectangle(){}
	public Rectangle(int xx,int yy,double wwidth,double hheight)
	{
		x=xx;
		y=yy;
		height = hheight;
		width=wwidth;
		
	}
	public String toString(){
		return "java.Rectangle[x="+ x +",y="+ y +",width="+ width +",height="+ height +"]"+"\nArea=" + width*height +"\nPerimeter="+ (width+height)*2;      
		
	}
	
}
public class HM1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		Rectangle rectangle1 = new Rectangle(15,25,57,18);
		Rectangle rectangle2 = new Rectangle(0,12,60,47);
		System.out.println(rectangle1);
		System.out.println("");
		
		System.out.println(rectangle2);
		
		System.out.println("");
	
		System.out.println("End of Output!");
	

	}

}
