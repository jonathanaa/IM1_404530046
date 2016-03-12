/*
 * [A]98
 * [TA's advise]
 * 1.x-axis,y-axis���S���i��|�O�B�I�ƩO?
 * 2.�D�حn�D�n�g���method: getWidth(),getHeight(),�ӧA�����g�FgetArea(),getPerimeter(), �o��u�q��2��.
 * */
class Rectangle {
	int x, y;
	double width, height;

	// �H�U��Ӫ���O�h�l��
	double area, perimeter;

	public Rectangle() {
		// ��ĳ�i�H�z�L���O�����I�s�غc�l�h��l�ƪ���
		// this(-1,-1,-1,-1);
	}

	public Rectangle(int xx, int yy, double wwidth, double hheight) {
		x = xx;
		y = yy;
		height = hheight;
		width = wwidth;

		// �H�U��ӭp��O�h�l��, �A�bmain�̭��w�g�z�Lfunction call�p��X�L�ӤF.
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
		// TODO �۰ʲ��ͪ���k Stub

		Rectangle rectangle1 = new Rectangle(15, 25, 57, 18);
		Rectangle rectangle2 = new Rectangle(0, 12, 60, 47);
		System.out.println(rectangle1);
		System.out.print("Area:");
		
		//�̷��D�حn�DArea���Ӽg��
		//System.out.println(rectangle1.getWidth()*rectangle1.getHeight());
		//Perimeter �ۦP�N��.
		
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
