/*
 * [A]98
 * [TA's advise]
 * 1.x-axis,y-axis有沒有可能會是浮點數呢?
 * 2.題目要求要寫兩個method: getWidth(),getHeight(),而你直接寫了getArea(),getPerimeter(), 這邊酌量扣2分.
 * */
class Rectangle {
	int x, y;
	double width, height;

	// 以下兩個物件是多餘的
	double area, perimeter;

	public Rectangle() {
		// 建議可以透過類別內部呼叫建構子去初始化物件
		// this(-1,-1,-1,-1);
	}

	public Rectangle(int xx, int yy, double wwidth, double hheight) {
		x = xx;
		y = yy;
		height = hheight;
		width = wwidth;

		// 以下兩個計算是多餘的, 你在main裡面已經透過function call計算出他來了.
		area = height * width;
		perimeter = (height + width) * 2;

	}

	// public double getWidth(){}
	// public double getHeight(){}

	public double getArea() {
		return area;
	}

	public double getPerimeter() {

		return perimeter;
	}

	public String toString() {
		return "java.Rectangle[x=" + x + ",y=" + y + ",width=" + width + ",height=" + height + "]";
	}
}

public class HM1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		Rectangle rectangle1 = new Rectangle(15, 25, 57, 18);
		Rectangle rectangle2 = new Rectangle(0, 12, 60, 47);
		System.out.println(rectangle1);
		System.out.print("Area:");
		
		//依照題目要求Area應該寫成
		//System.out.println(rectangle1.getWidth()*rectangle1.getHeight());
		//Perimeter 相同意思.
		
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
